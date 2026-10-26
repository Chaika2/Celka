package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlY_2 extends rrTF<ChestStealer> {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static float[] id_protected;
   private static short[] id_case;
   private static String[] id_catch;

   private static void id_byte() {
      id_case = new short[]{0, 1, 0, 0, 73, 0, 57, 1, 0, 1, 55, 57, 4, 1};
   }

   public rrlY_2(ChestStealer var1) {
      super(var1);
      this.id_throws();
      rrIm_1 var6 = new rrIm_1("Задержка", 10.0F, 10.0F, 500.0F, 10.0F).id_class(() -> this.id_continue().id_new() == this ? true : id_break[5]);
      this.id_class[0] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.id_class[1] = var7;
      var1.id_class((rrIm_1)this.id_class[0]);
   }

   static {
      ntfClinit();
   }

   private boolean id_class(rJY var1) {
      return !var1.id_break() ? false : id_break[3];
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_throws();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         vm_3 var3 = (vm_3)id_import.id_class[73];
         if (var3 instanceof Fc_1 var2) {
            rrNV var9 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws().id_switch();
            if (var9 != null) {
               return;
            }

            int var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_throws();
            if (var4 == -1) {
               return;
            }

            List var5 = var2.G_().id_class(null).stream().filter(this::id_class).collect(Collectors.toList());
            Collections.shuffle(var5);
            float var6 = ((rrIm_1)this.id_class[0]).id_byte();

            for (rJY var8 : var5) {
               if (((rrfw_3)this.id_class[1]).id_class((double)var6)) {
                  ((Ax_1)id_import.id_class[55])
                     .id_break(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case, var8.id_protected, 0, rXa_1.QUICK_MOVE, true);
                  ((rrfw_3)this.id_class[1]).id_class();
               }
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, 1, 100, 30, -34, 8, -11, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9026094422882420581L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -405168900;
   }

   private static void id_break() {
      id_catch = new String[]{new String("Задержка")};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private static void id_case() {
      id_protected = new float[]{10.0F, 10.0F, 500.0F, 10.0F};
   }

   private static void id_protected() {
      id_break = new boolean[]{false, true, false, true, true, false};
   }

   private static void id_private() {
      id_byte = new byte[]{-1, 2};
   }
}
