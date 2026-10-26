/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oq_1;
import celestial.Oy_1;
import celestial.event.EventTarget;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

public class Op_1
implements Oy_1 {
    private static boolean id_class;
    private static Constructor<MethodHandles.Lookup> id_break;
    private static Method id_byte;
    private final Class<?> id_protected;
    private final boolean id_throws;
    private final int id_case;
    private Consumer<Object> id_catch;
    private Object id_private;

    @Override
    public int id_byte() {
        return this.id_case;
    }

    public Op_1(Oq_1 oq_1, Class<?> clazz, Object object, Method method) {
        this.id_protected = method.getParameters()[0].getType();
        this.id_throws = Modifier.isStatic(method.getModifiers());
        this.id_case = method.getAnnotation(EventTarget.class).id_class();
        try {
            MethodType methodType;
            MethodHandle methodHandle;
            MethodHandles.Lookup lookup;
            String string = method.getName();
            if (id_class) {
                boolean bl = id_break.isAccessible();
                id_break.setAccessible(true);
                lookup = id_break.newInstance(clazz);
                id_break.setAccessible(bl);
            } else {
                lookup = oq_1.create(id_byte, clazz);
            }
            MethodType methodType2 = MethodType.methodType(Void.TYPE, method.getParameters()[0].getType());
            if (this.id_throws) {
                methodHandle = lookup.findStatic(clazz, string, methodType2);
                methodType = MethodType.methodType(Consumer.class);
            } else {
                methodHandle = lookup.findVirtual(clazz, string, methodType2);
                methodType = MethodType.methodType(Consumer.class, clazz);
            }
            MethodHandle methodHandle2 = LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(Void.TYPE, Object.class), methodHandle, methodType2).getTarget();
            this.id_catch = this.id_throws ? methodHandle2.invoke() : methodHandle2.invoke(object);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    static {
        try {
            id_class = System.getProperty("java.version").startsWith("1.8");
            if (id_class) {
                id_break = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class);
            } else {
                id_byte = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, MethodHandles.Lookup.class);
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
    }

    @Override
    public void id_class(Object object) {
        this.id_catch.accept(object);
    }

    @Override
    public Class<?> id_class() {
        return this.id_protected;
    }

    @Override
    public void id_break(Object object) {
        this.id_private = object;
    }

    @Override
    public Object id_break() {
        return this.id_private;
    }

    @Override
    public boolean id_protected() {
        return this.id_throws;
    }
}

