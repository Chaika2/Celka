package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjP_2 implements Hx_1 {
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;
   public static Object[] break_;
   private static float[] throws_;
   private static boolean[] case_;
   private static String[] catch_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[1] = 0.0F;
         this.class_[2] = false;
      }
   }

   private rrjP_2() {
      this.byte_();
      Float var5 = 1.0F;
      this.class_[1] = var5;
      Boolean var6 = true;
      this.class_[2] = var6;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, 0, -19, 12, -44, -13, 30, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 827685818595404655L;
   }

   public rrjP_2 class_(Hx_1 var1, float var2) {
      return this.class_(var1, var2, true);
   }

   public rrjP_2 class_(Hx_1 var1, float var2, boolean var3) {
      this.class_[0] = var1;
      Float var9 = var2;
      this.class_[1] = var9;
      Boolean var10 = var3;
      this.class_[2] = var10;
      return this;
   }

   private static HU class_(HU var0) {
      rqO_2 var1 = var0.float_();
      if (var1 == null) {
         return var0;
      } else {
         String var2 = var0.byte_();

         return switch (var2) {
            case "entity_cutout", "entity_solid" -> HU.catch_(var1);
            case "entity_cutout_no_cull", "entity_cutout_no_cull_z_offset" -> HU.private_(var1);
            default -> var0;
         };
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1672539521;
   }

   private static void break_() {
      case_ = new boolean[]{true, true, false, true, false, true, false, true};
   }

   private static void throws_() {
      byte_ = new byte[]{-1, 2, 3, 3, 2};
   }

   @Override
   public Ok_1 getBuffer(HU var1) {
      HU var2 = class_(var1);
      Ok_1 var3 = ((Hx_1)this.class_[0]).getBuffer(var2);
      return (Ok_1)(this.class_[2] ? new rrjB_2().class_(var3, (Float)this.class_[1]) : var3);
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrjP_2()};
      break_ = var0;
   }

   private static void case_() {
      protected_ = new short[]{1, 2, 0, 1, 2, 0, 2, 1};
   }

   private static void protected_() {
      catch_ = new String[]{
         new String("entity_cutout"), new String("entity_solid"), new String("entity_cutout_no_cull"), new String("entity_cutout_no_cull_z_offset")
      };
   }

   private static void private_() {
      throws_ = new float[]{1.0F, 0.0F};
   }
}
