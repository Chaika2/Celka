package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCI extends rrTF<Velocity> {
   private static short[] id_break;
   private static double[] id_byte;
   private static String[] id_protected;
   private static byte[] id_case;
   private static boolean[] id_catch;
   public Object[] id_class;
   private static float[] id_private;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[2] = false;
      }
   }

   public rrCI(Velocity var1) {
      super(var1);
      this.id_byte();
      rrIm_1 var6 = new rrIm_1(id_protected[0], 0.2F, 0.1F, 2.0F, 0.05F);
      this.id_class[id_break[0]] = var6;
      rrIk_1 var7 = new rrIk_1(id_protected[1], id_catch[0]);
      this.id_class[1] = var7;
      Setting[] var10001 = new Setting[2];
      var10001[id_catch[1]] = ((rrIm_1)this.id_class[id_break[2]]).id_class(() -> var1.id_new() == this ? true : id_catch[13]);
      var10001[1] = ((rrIk_1)this.id_class[1]).id_class(() -> var1.id_new() == this ? true : id_catch[11]);
      var1.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{19, -119, -87, 64, -3, -103, -95, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrAS var1) {
      this.id_byte();
      if ((Boolean)this.id_class[2]) {
         var1.id_class(true);
         Boolean var6 = id_catch[8];
         this.id_class[2] = var6;
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_byte();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[9]]) {
         if ((Boolean)this.id_class[2]) {
            float var2 = ((rrIm_1)this.id_class[id_break[11]]).id_byte();
            float var3 = ((cb_3)id_import.id_class[57]).sO() * (float) (Math.PI / 180.0);
            ((cb_3)id_import.id_class[57])
               .id_byte(((cb_3)id_import.id_class[57]).rv().id_break((double)(-rfU_2.id_class(var3) * var2), id_byte[0], (double)(rfU_2.id_break(var3) * var2)));
            Boolean var8 = id_catch[9];
            this.id_class[2] = var8;
         }

         if (((rrIk_1)this.id_class[1]).id_class() && (Integer)((cb_3)id_import.id_class[57]).id_private[10] > 0) {
            rrfj_3.id_class(rrfj_3.id_break());
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -460101709;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 682455804367940377L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_byte();
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvc_3 var3) {
         if ((cb_3)id_import.id_class[57] != null && var3.id_break() == ((cb_3)id_import.id_class[57]).V()) {
            var3.id_class(id_catch[3]);
            var3.id_break(var3.id_protected());
            var3.id_byte(id_catch[4]);
            Boolean var10 = true;
            this.id_class[2] = var10;
         }
      } else if (var2 instanceof rvu_3 var4) {
         var4.id_class(id_private[4]);
         var4.id_break(var4.id_byte());
         var4.id_byte(id_private[5]);
      } else if (var2 instanceof rvQ_2 var5 && var5.id_break() == 31) {
         var1.id_class(true);
      }
   }

   private static void id_class() {
      id_private = new float[]{0.2F, 0.1F, 2.0F, 0.05F, 0.0F, 0.0F, (float) (Math.PI / 180.0)};
   }

   private static void id_break() {
      id_protected = new String[]{new String("Сила"), new String("Стрейф")};
   }

   private static void id_throws() {
      id_byte = new double[1];
   }

   private static void id_case() {
      id_catch = new boolean[]{false, false, true, false, false, true, true, true, false, false, true, false, true, false, false};
   }

   private static void id_protected() {
      id_case = new byte[]{2, 31, 3, 2};
   }

   private static void id_private() {
      id_break = new short[]{0, 1, 0, 1, 57, 57, 2, 2, 2, 0, 2, 0, 57, 57, 57, 2, 1, 57, 10};
   }
}
