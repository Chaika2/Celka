package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlS_2 extends rrTF<Speed> {
   public Object[] id_class;
   private static short[] id_break;
   private static float[] id_byte;
   private static double[] id_protected;
   private static byte[] id_case;
   private static boolean[] id_catch;

   private static void id_byte() {
      id_break = new short[]{0, 1, 0, 2, 2, 57, 17, 57, 57, 2, 6, 6, 2, 160, 2, 1, 0, 1, 57, 0, 0, 1, 57, 6, 2, 1, 57, 0, 1};
   }

   public rrlS_2(Speed var1) {
      super(var1);
      this.id_private();
      rrfw_3 var6 = new rrfw_3();
      this.id_class[id_break[0]] = var6;
      ArrayDeque var7 = new ArrayDeque();
      this.id_class[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5161664214949964494L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -732319033;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, 115, -17, 100, -72, -75, 58, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_private();
      if (var1.id_class() instanceof rmg_3 var2) {
         ((Queue)this.id_class[1]).add(var2);
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_private();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[2]]) {
         Integer var7 = (Integer)this.id_class[2] + 1;
         this.id_class[2] = var7;
         if (!((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private && ((cb_3)id_import.id_class[57]).BL()) {
            ((cb_3)id_import.id_class[57]).sl();
         }

         if ((Integer)this.id_class[2] < 5) {
            ((rqw_3)id_import.id_class[6]).id_class(0.1F);
         } else {
            ((rqw_3)id_import.id_class[6]).id_class(1.3F);
         }

         if ((Integer)this.id_class[2] > 160) {
            Integer var8 = Integer.valueOf(id_catch[1]);
            this.id_class[2] = var8;
         }

         if (!((Queue)this.id_class[1]).isEmpty() && ((rrfw_3)this.id_class[id_break[16]]).id_class(500.0)) {
            ruS_2 var2 = (ruS_2)((Queue)this.id_class[1]).poll();
            if (var2 != null) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_break[19]]).id_break(var2);
            }

            ((rrfw_3)this.id_class[id_break[20]]).id_class();
         }
      }
   }

   private static void id_class() {
      id_case = new byte[]{5, 3, 2};
   }

   private void id_break() {
      this.id_private();
      ((rqw_3)id_import.id_class[6]).id_class(1.0F);
      Integer var5 = Integer.valueOf(id_catch[3]);
      this.id_class[2] = var5;

      while (!((Queue)this.id_class[1]).isEmpty()) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_break[27]]).id_break((ruS_2<?>)((Queue)this.id_class[1]).poll());
      }
   }

   private static void id_throws() {
      id_catch = new boolean[]{true, false, true, false, false};
   }

   private static void id_case() {
      id_protected = new double[]{500.0};
   }

   private static void id_protected() {
      id_byte = new float[]{0.1F, 1.3F, 1.0F};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[2] = 0;
      }
   }

   @Override
   public boolean aK_() {
      if ((cb_3)id_import.id_class[57] != null) {
         this.id_break();
      }

      return super.aK_();
   }
}
