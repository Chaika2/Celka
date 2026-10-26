package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLO implements MinecraftAccessor {
   @Nullable
   private Aw_1 byte_;
   public static Object[] class_;
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] break_;
   @Nullable
   private UUID case_;
   private static boolean[] catch_;

   public rgP_2 byte_() {
      return (rgP_2)this.break_[0];
   }

   public rrLO() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   @Nullable
   public UUID class_() {
      return this.case_;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 15, 33, 82, 2, -128, 49, 87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(rgP_2 var0, @Nullable Aw_1 var1, @Nullable UUID var2) {
      if ((cb_3)import_.class_[57] != null) {
         rrLO var3 = class_(var0, var0.byte_(), var1, var2);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      }
   }

   public static rrLO class_(rgP_2 var0, String var1, @Nullable Aw_1 var2, @Nullable UUID var3) {
      ((rrLO)class_[0]).break_[0] = var0;
      ((rrLO)class_[0]).break_[1] = var1;
      ((rrLO)class_[0]).byte_ = var2;
      ((rrLO)class_[0]).case_ = var3;
      return (rrLO)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 888029085;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4731220668415145908L;
   }

   @Nullable
   public Aw_1 break_() {
      return this.byte_;
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrLO()};
      class_ = var0;
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }

   private static void implements_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 0, 57, 0, 0, 0, 1};
   }

   public String protected_() {
      return (String)this.break_[1];
   }

   private static void private_() {
      catch_ = new boolean[]{false, true};
   }
}
