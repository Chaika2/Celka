package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrjU_2 implements MinecraftAccessor {
   private static byte[] bytesf70af72d4e3133959ed8b9ae51cf5789;
   private static String[] stringsf70af72d4e3133959ed8b9ae51cf5789;
   private static double[] doublesf70af72d4e3133959ed8b9ae51cf5789;
   public static Object[] staticFieldsf70af72d4e3133959ed8b9ae51cf5789;
   private static short[] shortsf70af72d4e3133959ed8b9ae51cf5789;
   private static float[] floatsf70af72d4e3133959ed8b9ae51cf5789;
   private static boolean[] booleansf70af72d4e3133959ed8b9ae51cf5789;

   private static void id_byte() {
      booleansf70af72d4e3133959ed8b9ae51cf5789 = new boolean[]{false, true, false, true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   public void id_class(rrnE_2 var1) {
      if (!((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_break()) {
         Ml_1 var2 = var1.id_class();
         rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_private();
         rjV_2 var4 = ((Hh_1)id_import.id_class[16]).id_volatile();
         String var5 = rrfp_3.id_throws();
         var2.id_class();

         for (rrjD_2 var7 : ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_byte()) {
            if (var7.id_break(var5)) {
               eX_2 var8 = var7.id_break();
               rji_3 var9 = rrfa_3.id_class(var4, var8);
               float var10 = var9.id_class();
               float var11 = var9.id_break();
               String var12 = var7.id_byte() + rgF_2.GRAY + " » " + rgF_2.RESET + (int)((cb_3)id_import.id_class[57]).id_class(var8) + "м";
               int var13 = var3.id_class();
               float var14 = var3.id_break(var12) / 2.0F;
               float var15 = 17.0F;
               if (id_class(var10 + var14, var11 - var15, var10 - var14, (float)var13 + var15)) {
                  float var16 = (float)(Math.sin((double)System.currentTimeMillis() / 400.0) * 1.5);
                  var3.id_class(var2, var12, var10, var11, rrZF.d_, false);
                  rrfD_2.id_class(
                     var2,
                     (rqO_2)staticFieldsf70af72d4e3133959ed8b9ae51cf5789[1],
                     var10 - 9.0F,
                     var11 - var15 + var16,
                     16.0F,
                     16.0F,
                     ColorHelper.id_class(0.0F),
                     ColorHelper.id_class(90.0F),
                     ColorHelper.id_class(180.0F),
                     ColorHelper.id_class(270.0F)
                  );
               }
            }
         }

         var2.id_break();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -848879010;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, 69, 43, -99, -9, -18, 56, 15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      bytesf70af72d4e3133959ed8b9ae51cf5789 = new byte[]{2, 3};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1267833548278180179L;
   }

   private static boolean id_class(float var0, float var1, float var2, float var3) {
      return var2 < id_const.id_volatile() && var0 > 0.0F && var1 < id_const.id_final() && var1 > -var3 ? true : booleansf70af72d4e3133959ed8b9ae51cf5789[2];
   }

   private static void id_break() {
      shortsf70af72d4e3133959ed8b9ae51cf5789 = new short[]{2, 0, 0, 16, 0, 57, 1, 0};
   }

   private static void id_throws() {
      floatsf70af72d4e3133959ed8b9ae51cf5789 = new float[]{2.0F, 17.0F, 9.0F, 16.0F, 16.0F, 0.0F, 90.0F, 180.0F, 270.0F, 0.0F};
   }

   private static void id_catch() {
      stringsf70af72d4e3133959ed8b9ae51cf5789 = new String[]{new String("INSTANCE"), new String("celestial/images/waypoint.png")};
   }

   private static void id_case() {
      doublesf70af72d4e3133959ed8b9ae51cf5789 = new double[]{400.0, 1.5};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrjU_2(), new rqO_2("minecraft", "celestial/images/waypoint.png"), null};
      var0[2] = new rrjU_2[]{(rrjU_2)var0[0]};
      staticFieldsf70af72d4e3133959ed8b9ae51cf5789 = var0;
   }
}
