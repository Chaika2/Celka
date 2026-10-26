package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BJ extends Pv_1 implements MinecraftAccessor {
   private static short[] byte_;
   private static float[] protected_;
   private static String[] throws_;
   private static byte[] case_;
   private static boolean[] catch_;
   public Object[] break_;

   private static void byte_() {
      byte_ = new short[]{0, 0, 1, 0, 0, 0, 5000, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0};
   }

   public BJ(C_class var1) {
      super(var1);
      this.break_();
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrFw_1 var1) {
      this.break_();
      if (var1.class_() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]) {
         Boolean var6 = true;
         this.break_[0] = var6;
      } else if (var1.class_() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[0]) {
         Boolean var7 = false;
         this.break_[0] = var7;
      }
   }

   private static void class_() {
      throws_ = new String[]{new String("/hub")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -104335753;
   }

   @Override
   public void class_(C var1) {
      this.break_();
      String var2 = var1.class_();
      if (var2.startsWith("/hub")) {
         Boolean var7 = false;
         this.break_[0] = var7;
         Boolean var8 = false;
         this.break_[1] = var8;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7175087397734893727L;
   }

   @Override
   public void class_(rrFK var1) {
      this.break_();
      Boolean var6 = false;
      this.break_[0] = var6;
      Boolean var7 = false;
      this.break_[1] = var7;
   }

   @Override
   public void class_(q_1 var1) {
      this.break_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.protected_()) {
            return;
         }

         if ((Boolean)this.break_[0] && (Boolean)this.break_[1]) {
            RwHelper var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().R();
            String var3 = "Напишите '" + (String)C_class.instanceof_().protected_.class_[0] + "rct' чтобы сбросить флаги античита";
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3(var2.final_(), var3, 5000));
            rrfu_3.byte_(var3);
            Boolean var8 = false;
            this.break_[0] = var8;
            Boolean var9 = false;
            this.break_[1] = var9;
         }
      }
   }

   @Override
   public void class_(rrAl_1 var1) {
      this.break_();
      if ((Boolean)this.break_[0] && var1.class_() > 10.0F) {
         Boolean var6 = true;
         this.break_[1] = var6;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -118, 61, 118, -70, 92, -101, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[1] = false;
      }
   }

   private static void throws_() {
      catch_ = new boolean[]{false, false, true, true, false, false, false, false, false, false, false, true, false, false, true, false};
   }

   private static void catch_() {
      protected_ = new float[]{10.0F};
   }

   private static void case_() {
      case_ = new byte[]{2};
   }

   private boolean protected_() {
      if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         return false;
      } else {
         return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().R().aJ_() ? false : catch_[11];
      }
   }
}
