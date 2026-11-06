import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Fixes the Celestial build of Baritone: celestial.Ev_1 (Baritone's Movement
 * base class) creates the 5-element
 * HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP array but leaves
 * every element null. MovementAscend.cost() then dereferences null when it
 * tries to find a block to place against, which is what happens while mining
 * ancient debris in the Nether.
 *
 * This tool rewrites only the static initializer helper
 * {@code id_continue()V} so the array contains the upstream Baritone order:
 * NORTH, SOUTH, EAST, WEST, DOWN.
 */
public final class Ev1DirectionFix {
    private static final String OWNER = "celestial/Ev_1";
    private static final String DIRECTION = "celestial/rpr_3";
    private static final String FIELD = "id_class";
    private static final String FIELD_DESC = "[Ljava/lang/Object;";
    private static final String METHOD = "id_continue";
    private static final String METHOD_DESC = "()V";

    private Ev1DirectionFix() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("usage: Ev1DirectionFix <input.class> <output.class>");
        }

        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);
        byte[] original = Files.readAllBytes(input);

        ClassReader reader = new ClassReader(original);
        if (!OWNER.equals(reader.getClassName())) {
            throw new IllegalStateException("expected " + OWNER + ", got " + reader.getClassName());
        }

        ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
        boolean[] seenField = {false};
        boolean[] seenMethod = {false};

        ClassVisitor visitor = new ClassVisitor(Opcodes.ASM9, writer) {
            @Override
            public org.objectweb.asm.FieldVisitor visitField(int access, String name, String descriptor,
                                                             String signature, Object value) {
                if (FIELD.equals(name) && FIELD_DESC.equals(descriptor)) {
                    seenField[0] = true;
                }
                return super.visitField(access, name, descriptor, signature, value);
            }

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor,
                                             String signature, String[] exceptions) {
                MethodVisitor target = super.visitMethod(access, name, descriptor, signature, exceptions);
                if (!METHOD.equals(name) || !METHOD_DESC.equals(descriptor)) {
                    return target;
                }

                seenMethod[0] = true;
                // Ignore the broken original body and emit a fixed one at visitEnd.
                // All callbacks of this wrapper are no-ops; target is written only
                // by emit() so the original instructions never reach ClassWriter.
                return new MethodVisitor(Opcodes.ASM9) {
                    @Override
                    public void visitEnd() {
                        emit(target);
                        target.visitEnd();
                    }
                };
            }
        };

        reader.accept(visitor, 0);

        if (!seenField[0]) {
            throw new IllegalStateException(OWNER + "." + FIELD + " not found");
        }
        if (!seenMethod[0]) {
            throw new IllegalStateException(OWNER + "." + METHOD + METHOD_DESC + " not found");
        }

        Files.write(output, writer.toByteArray());
    }

    private static void emit(MethodVisitor mv) {
        // id_class = new Object[]{new Direction[]{NORTH, SOUTH, EAST, WEST, DOWN}};
        mv.visitCode();

        mv.visitInsn(Opcodes.ICONST_1);
        mv.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
        mv.visitInsn(Opcodes.DUP);
        mv.visitInsn(Opcodes.ICONST_0);

        mv.visitInsn(Opcodes.ICONST_5);
        mv.visitTypeInsn(Opcodes.ANEWARRAY, DIRECTION);

        String[] directions = {"NORTH", "SOUTH", "EAST", "WEST", "DOWN"};
        for (int i = 0; i < directions.length; i++) {
            mv.visitInsn(Opcodes.DUP);
            mv.visitInsn(Opcodes.ICONST_0 + i);
            mv.visitFieldInsn(Opcodes.GETSTATIC, DIRECTION, directions[i], "L" + DIRECTION + ";");
            mv.visitInsn(Opcodes.AASTORE);
        }

        mv.visitInsn(Opcodes.AASTORE);
        mv.visitFieldInsn(Opcodes.PUTSTATIC, OWNER, FIELD, FIELD_DESC);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }
}
