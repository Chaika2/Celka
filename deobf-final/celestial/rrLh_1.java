package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLh_1 extends Om_1 {
   @Nullable
   private Aw_1 byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static short[] throws_;
   private static byte[] case_;
   @Nullable
   private UUID catch_;
   public Object[] break_;

   public rrLh_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4686855948117934490L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, 15, -16, 122, -48, -107, -84, 107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLh_1 class_(rgP_2 var0, UUID var1) {
      rrLh_1 var2 = class_(var0, var0.byte_(), var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      return var2;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1867365368;
   }

   public static rrLh_1 class_(rgP_2 var0, String var1, UUID var2) {
      ((rrLh_1)class_[0]).break_[0] = var0;
      ((rrLh_1)class_[0]).break_[1] = var1;
      ((rrLh_1)class_[0]).byte_ = rrfV_2.class_(var0, var1);
      ((rrLh_1)class_[0]).catch_ = var2;
      ((rrLh_1)class_[0]).class_(false);
      return (rrLh_1)class_[0];
   }

   public String class_() {
      this.case_();
      return (String)this.break_[1];
   }

   public void class_(rgP_2 var1) {
      this.case_();
      this.break_[0] = var1;
   }

   @Nullable
   public UUID break_() {
      return this.catch_;
   }

   public rgP_2 throws_() {
      this.case_();
      return (rgP_2)this.break_[0];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrLh_1()};
      class_ = var0;
   }

   private static void catch_() {
      case_ = new byte[]{2};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void implements_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0};
   }

   @Nullable
   public Aw_1 protected_() {
      return this.byte_;
   }

   private static void private_() {
      protected_ = new boolean[]{false, false, true};
   }
}
