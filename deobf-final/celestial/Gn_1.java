package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gn_1 extends bq_3 implements rc_3 {
   private static byte[] throws_;
   private static String[] catch_;
   private static short[] private_;
   private static boolean[] implements_;
   public Object[] break_;

   @Override
   public boolean byte_() {
      this.volatile_();
      return (Gl_1)this.break_[1] != (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[0] ? true : implements_[1];
   }

   public Gn_1(C_class var1) {
      super(var1);
      this.volatile_();
   }

   static {
      ntfClinit();
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.volatile_();
      switch (((int[])GC.class_[0])[((Gl_1)this.break_[1]).ordinal()]) {
         case 1:
            return new rn_3((rP_2)this.break_[0], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         case 2:
            rn_3 var3 = new rn_3((rP_2)this.break_[0], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
            Gl_1 var8 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[3];
            this.break_[1] = var8;
            return var3;
         case 3:
            if (var1) {
               this.protected_();
               return new rn_3((rP_2)this.break_[0], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
            } else {
               if ((rP_2)this.break_[0] == null
                  || ((rP_2)this.break_[0]).break_(((Ps_1)this.case_[1]).volatile_())
                     && ((rP_2)this.break_[0]).break_(((C_class)this.case_[0]).while_().super_())) {
                  this.protected_();
                  if ((Boolean)C_class.instanceof_().char_.class_[0]) {
                     ((Ps_1)this.case_[1]).case_().catch_();
                  }

                  if ((Boolean)C_class.instanceof_().rK.class_[0]) {
                     this.byte_("Pathing complete", false);
                  }

                  return new rn_3((rP_2)this.break_[0], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               }

               return new rn_3((rP_2)this.break_[0], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
            }
         default:
            throw new IllegalStateException();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2099208252;
   }

   @Override
   public void class_(rP_2 var1) {
      this.volatile_();
      this.break_[0] = var1;
      if ((Gl_1)this.break_[1] == (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[0]) {
         Gl_1 var7 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[1];
         this.break_[1] = var7;
      }

      if ((Gl_1)this.break_[1] == (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[3]) {
         Gl_1 var8 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[2];
         this.break_[1] = var8;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, 120, 109, 52, -35, 106, 93, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2299220874095203358L;
   }

   @Override
   public String class_() {
      this.volatile_();
      return "Custom Goal " + (rP_2)this.break_[0];
   }

   private static void finally_() {
      implements_ = new boolean[]{true, false, false};
   }

   private static void extends_() {
      private_ = new short[]{0, 1, 0, 1, 1, 1, 3, 2, 1, 2, 1, 0, 1, 0, 0, 1, 0, 2, 0, 4, 3, 1, 0, 2, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0};
   }

   @Override
   public void implements_() {
      this.volatile_();
      Gl_1 var5 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[2];
      this.break_[1] = var5;
   }

   @Override
   public void protected_() {
      this.volatile_();
      super.protected_();
      Gl_1 var5 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[0];
      this.break_[1] = var5;
      Object var6 = null;
      this.break_[0] = var6;
   }

   @Override
   public rP_2 private_() {
      this.volatile_();
      return (rP_2)this.break_[0];
   }

   private static void final_() {
      catch_ = new String[]{new String("Pathing complete")};
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void native_() {
      throws_ = new byte[]{2};
   }
}
