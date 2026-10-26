package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCI extends rrTF<Velocity> {
   private static short[] break_;
   private static double[] byte_;
   private static String[] protected_;
   private static byte[] case_;
   private static boolean[] catch_;
   public Object[] class_;
   private static float[] private_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[2] = false;
      }
   }

   public rrCI(Velocity var1) {
      super(var1);
      this.byte_();
      rrIm_1 var6 = new rrIm_1("Сила", 0.2F, 0.1F, 2.0F, 0.05F);
      this.class_[0] = var6;
      rrIk_1 var7 = new rrIk_1("Стрейф", false);
      this.class_[1] = var7;
      var1.class_(
         new Setting[]{
            ((rrIm_1)this.class_[0]).class_(() -> var1.new_() == this ? true : catch_[13]),
            ((rrIk_1)this.class_[1]).class_(() -> var1.new_() == this ? true : catch_[11])
         }
      );
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{19, -119, -87, 64, -3, -103, -95, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrAS var1) {
      this.byte_();
      if ((Boolean)this.class_[2]) {
         var1.class_(true);
         Boolean var6 = false;
         this.class_[2] = var6;
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.byte_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Boolean)this.class_[2]) {
            float var2 = ((rrIm_1)this.class_[0]).byte_();
            float var3 = ((cb_3)import_.class_[57]).sO() * (float) (Math.PI / 180.0);
            ((cb_3)import_.class_[57])
               .byte_(((cb_3)import_.class_[57]).rv().break_((double)(-rfU_2.class_(var3) * var2), 0.0, (double)(rfU_2.break_(var3) * var2)));
            Boolean var8 = false;
            this.class_[2] = var8;
         }

         if (((rrIk_1)this.class_[1]).class_() && (Integer)((cb_3)import_.class_[57]).private_[10] > 0) {
            rrfj_3.class_(rrfj_3.break_());
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -460101709;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 682455804367940377L;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.byte_();
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rvc_3 var3) {
         if ((cb_3)import_.class_[57] != null && var3.break_() == ((cb_3)import_.class_[57]).V()) {
            var3.class_(0);
            var3.break_(var3.protected_());
            var3.byte_(0);
            Boolean var10 = true;
            this.class_[2] = var10;
         }
      } else if (var2 instanceof rvu_3 var4) {
         var4.class_(0.0F);
         var4.break_(var4.byte_());
         var4.byte_(0.0F);
      } else if (var2 instanceof rvQ_2 var5 && var5.break_() == 31) {
         var1.class_(true);
      }
   }

   private static void class_() {
      private_ = new float[]{0.2F, 0.1F, 2.0F, 0.05F, 0.0F, 0.0F, (float) (Math.PI / 180.0)};
   }

   private static void break_() {
      protected_ = new String[]{new String("Сила"), new String("Стрейф")};
   }

   private static void throws_() {
      byte_ = new double[1];
   }

   private static void case_() {
      catch_ = new boolean[]{false, false, true, false, false, true, true, true, false, false, true, false, true, false, false};
   }

   private static void protected_() {
      case_ = new byte[]{2, 31, 3, 2};
   }

   private static void private_() {
      break_ = new short[]{0, 1, 0, 1, 57, 57, 2, 2, 2, 0, 2, 0, 57, 57, 57, 2, 1, 57, 10};
   }
}
