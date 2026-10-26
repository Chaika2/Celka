package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQA extends LV<rrQn_1> {
   private static short[] throws_;
   private static double[] case_;
   private static byte[] catch_;
   public Object[] class_;
   private static boolean[] private_;

   public rrQA(rrQC var1, QY var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.public_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      rrQn_1 var4 = this.finally_();
      return (var4 == null || !var4.class_(var1, var2, var3)) && !super.class_(var1, var2, var3) ? private_[4] : private_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1878677189708667783L;
   }

   public void class_(rrQn_1 var1) {
      this.public_();
      super.class_(var1);
      ((rrQC)this.class_[0]).byte_(var1 != null ? true : private_[2]);
   }

   public void class_(String var1) {
      this.native_();
      this.class_(0.0);
      ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
         .class_()
         .stream()
         .filter(var1x -> var1x.class_().toLowerCase().contains(var1.toLowerCase()))
         .forEach(var1x -> {
            this.public_();
            this.break_(new rrQn_1(this, this.native_, (rrQC)this.class_[0], var1x));
         });
      this.class_(this.this_().isEmpty() ? null : this.byte_(0));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, 23, 124, 2, -10, 40, 73, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void else_() {
      case_ = new double[1];
   }

   private static void implements_() {
      private_ = new boolean[]{false, true, false, true, false, true};
   }

   private static void return_() {
      throws_ = new short[4];
   }

   private void public_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public int protected_() {
      return super.protected_() + 5;
   }

   private static int private_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1984026658;
   }

   public Optional<rrQn_1> private_() {
      return Optional.ofNullable(this.finally_());
   }

   private static void synchronized_() {
      catch_ = new byte[]{30, 5};
   }

   @Override
   public int F_() {
      return super.F_() + 30;
   }
}
