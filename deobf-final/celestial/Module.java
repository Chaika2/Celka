package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Module extends rrwI_2 implements MinecraftAccessor {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;

   public void byte_(boolean var1) {
      this.goto_();
      if ((Boolean)this.class_[6]) {
         this.throws_(var1);
         this.volatile_();
      }
   }

   public void byte_() {
   }

   public Category int_() {
      this.goto_();
      return (Category)this.class_[3];
   }

   public Module(String var1, KeyBind var2) {
      this.goto_();
      ArrayList var7 = new ArrayList();
      this.class_[8] = var7;
      this.class_[0] = var1;
      this.class_[4] = var2;
   }

   public Module(String var1, String var2, Category var3, KeyBind var4) {
      this.goto_();
      ArrayList var9 = new ArrayList();
      this.class_[8] = var9;
      this.class_[0] = var1;
      String var11 = var1.toLowerCase();
      this.class_[1] = var11;
      this.class_[4] = var4;
      this.class_[5] = var4;
      this.class_[2] = var2;
      this.class_[3] = var3;
      ((List)this.class_[8]).add(new rrTL());
      if (this instanceof rrnv_3) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().break_(this);
      }
   }

   public Module(String var1, String var2, Category var3) {
      this(var1, var2, var3, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1557518106;
   }

   public void class_(KeyBind var1, boolean var2) {
      this.goto_();
      this.class_[4] = var1;
      if (var2) {
         ((List)this.class_[8]).forEach(var2x -> var2x.class_(this, var1));
      }
   }

   public void class_(boolean var1, boolean var2) {
      this.goto_();
      Boolean var7 = var1;
      this.class_[7] = var7;
      if (var2) {
         ((List)this.class_[8]).forEach(var2x -> var2x.class_(this, var1));
      }
   }

   public void class_(boolean var1) {
      this.goto_();
      if (var1) {
         ((List)this.class_[8]).forEach(var1x -> var1x.class_(this));
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, 126, -75, 68, -65, 64, -8, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4463582562046162875L;
   }

   public void break_(boolean var1) {
      this.goto_();
      if (this instanceof rrnv_3) {
         this.byte_(false);
      } else if (!(Boolean)this.class_[6]) {
         this.av_();
         this.class_(var1);
      }
   }

   public List<rrTv_1> throws_() {
      this.goto_();
      return (List<rrTv_1>)this.class_[8];
   }

   public void throws_(boolean var1) {
      this.goto_();
      if (var1) {
         ((List)this.class_[8]).forEach(var1x -> var1x.break_(this));
      }
   }

   public void finally_() {
   }

   public String extends_() {
      this.goto_();
      return (String)this.class_[0];
   }

   private void goto_() {
      if (this.class_ == null) {
         this.class_ = new Object[9];
         this.class_[6] = false;
         this.class_[7] = false;
      }
   }

   public rVi_1 case_() {
      return new rVe_1(this.final_());
   }

   private static void else_() {
      byte_ = new short[]{8, 0, 1, 4, 5, 2, 3, 8, 0, 8, 0, 4, 0, 6, 6, 6, 6, 0, 6, 6, 6, 0, 8, 8, 0, 4, 8, 7, 8, 0, 1, 2, 3, 5, 6, 7, 8, 4, 6};
   }

   public boolean implements_() {
      this.goto_();
      return (Boolean)this.class_[7];
   }

   public KeyBind package_() {
      this.goto_();
      return (KeyBind)this.class_[4];
   }

   private static void return_() {
      protected_ = new byte[]{9, 6, 7};
   }

   private static void public_() {
      break_ = new boolean[]{true, true, false, true, false, false, false};
   }

   public void protected_(boolean var1) {
      this.goto_();
      Boolean var6 = var1;
      this.class_[6] = var6;
   }

   public String final_() {
      this.goto_();
      return (String)this.class_[0];
   }

   public void volatile_() {
      this.goto_();
      if ((Boolean)this.class_[6]) {
         Boolean var5 = false;
         this.class_[6] = var5;
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().byte_(this);
      }
   }

   @Override
   public String synchronized_() {
      return this.final_();
   }

   public boolean aJ_() {
      this.goto_();
      return (Boolean)this.class_[6];
   }

   public void aw_() {
      this.goto_();
      if (!(this instanceof rrnv_3)) {
         if ((Boolean)this.class_[6]) {
            this.byte_(true);
         } else {
            this.break_(true);
         }
      }
   }

   public void av_() {
      this.goto_();
      if (!(Boolean)this.class_[6]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().break_(this);
         Boolean var5 = true;
         this.class_[6] = var5;
      }
   }

   public KeyBind ax_() {
      this.goto_();
      return (KeyBind)this.class_[5];
   }

   public String ay_() {
      this.goto_();
      return (String)this.class_[2];
   }

   public String aH_() {
      this.goto_();
      return (String)this.class_[1];
   }
}
