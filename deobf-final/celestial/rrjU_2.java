package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrjU_2 implements MinecraftAccessor {
   ;
   private static byte[] bytesf70af72d4e3133959ed8b9ae51cf5789;
   private static String[] stringsf70af72d4e3133959ed8b9ae51cf5789;
   private static double[] doublesf70af72d4e3133959ed8b9ae51cf5789;
   public static Object[] staticFieldsf70af72d4e3133959ed8b9ae51cf5789;
   private static short[] shortsf70af72d4e3133959ed8b9ae51cf5789;
   private static float[] floatsf70af72d4e3133959ed8b9ae51cf5789;
   private static boolean[] booleansf70af72d4e3133959ed8b9ae51cf5789;

   private static void byte_() {
      booleansf70af72d4e3133959ed8b9ae51cf5789 = new boolean[]{false, true, false, true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   public void class_(rrnE_2 var1) {
      if (!((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).break_()) {
         Ml_1 var2 = var1.class_();
         rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).private_();
         rjV_2 var4 = ((Hh_1)import_.class_[16]).volatile_();
         String var5 = rrfp_3.throws_();
         var2.class_();

         for (rrjD_2 var7 : ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).byte_()) {
            if (var7.break_(var5)) {
               eX_2 var8 = var7.break_();
               rji_3 var9 = rrfa_3.class_(var4, var8);
               float var10 = var9.class_();
               float var11 = var9.break_();
               String var12 = var7.byte_() + rgF_2.GRAY + " » " + rgF_2.RESET + (int)((cb_3)import_.class_[57]).class_(var8) + "м";
               int var13 = var3.class_();
               float var14 = var3.break_(var12) / 2.0F;
               float var15 = 17.0F;
               if (class_(var10 + var14, var11 - var15, var10 - var14, (float)var13 + var15)) {
                  float var16 = (float)(Math.sin((double)System.currentTimeMillis() / 400.0) * 1.5);
                  var3.class_(var2, var12, var10, var11, rrZF.d_, false);
                  rrfD_2.class_(
                     var2,
                     (rqO_2)staticFieldsf70af72d4e3133959ed8b9ae51cf5789[1],
                     var10 - 9.0F,
                     var11 - var15 + var16,
                     16.0F,
                     16.0F,
                     ColorHelper.class_(0.0F),
                     ColorHelper.class_(90.0F),
                     ColorHelper.class_(180.0F),
                     ColorHelper.class_(270.0F)
                  );
               }
            }
         }

         var2.break_();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -848879010;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, 69, 43, -99, -9, -18, 56, 15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      bytesf70af72d4e3133959ed8b9ae51cf5789 = new byte[]{2, 3};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1267833548278180179L;
   }

   private static boolean class_(float var0, float var1, float var2, float var3) {
      return var2 < const_.volatile_() && var0 > 0.0F && var1 < const_.final_() && var1 > -var3 ? true : booleansf70af72d4e3133959ed8b9ae51cf5789[2];
   }

   private static void break_() {
      shortsf70af72d4e3133959ed8b9ae51cf5789 = new short[]{2, 0, 0, 16, 0, 57, 1, 0};
   }

   private static void throws_() {
      floatsf70af72d4e3133959ed8b9ae51cf5789 = new float[]{2.0F, 17.0F, 9.0F, 16.0F, 16.0F, 0.0F, 90.0F, 180.0F, 270.0F, 0.0F};
   }

   private static void catch_() {
      stringsf70af72d4e3133959ed8b9ae51cf5789 = new String[]{new String("INSTANCE"), new String("celestial/images/waypoint.png")};
   }

   private static void case_() {
      doublesf70af72d4e3133959ed8b9ae51cf5789 = new double[]{400.0, 1.5};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrjU_2(), new rqO_2("minecraft", "celestial/images/waypoint.png"), null};
      var0[2] = new rrjU_2[]{(rrjU_2)var0[0]};
      staticFieldsf70af72d4e3133959ed8b9ae51cf5789 = var0;
   }
}
