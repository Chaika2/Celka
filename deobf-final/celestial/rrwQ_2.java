package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwQ_2 extends rrwk_3 {
   private static short[] throws_;
   private static boolean[] case_;
   public static Object[] byte_;
   private static byte[] catch_;
   private static String[] private_;
   public Object[] protected_;

   @Override
   public rrfq_3 byte_() {
      return (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2];
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, -45, 7, -48, 61, 123, 117, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrwQ_2(C_class var1) {
      super(var1);
      this.private_();
      HashSet var6 = new HashSet();
      this.protected_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrnM_2 var1) {
      this.private_();
      if (this.break_()) {
         cG_2 var2 = var1.class_();
         UUID var3 = var2.ro();
         if (var2 != ((Ps_1)this.class_[1]).catch_()) {
            if (((List)byte_[0]).contains(var3)) {
               boolean var4 = ((Set)this.protected_[0]).add(var3);
               if (var4 && ((Set)this.protected_[0]).containsAll((List)byte_[0])) {
                  Boolean var9 = true;
                  this.protected_[1] = var9;
               }
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8203038984714619279L;
   }

   @Override
   public void class_(rrFK var1) {
      super.class_(var1);
      this.protected_();
   }

   @Override
   public void class_(q_1 var1) {
      this.private_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.break_()) {
            return;
         }

         if ((Boolean)this.protected_[1]) {
            this.class_(true);
            this.protected_();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1750275312;
   }

   private static void throws_() {
      throws_ = new short[]{0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 2};
   }

   private static void finally_() {
      private_ = new String[]{new String("3b01930b-1b2c-2948-a912-07ff6e2346ee"), new String("2c4b7b7d-f822-2d7f-9ae9-929891fcac08")};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{
         List.of((UUID)UUID.fromString("3b01930b-1b2c-2948-a912-07ff6e2346ee"), (UUID)UUID.fromString("2c4b7b7d-f822-2d7f-9ae9-929891fcac08"))
      };
      byte_ = var0;
   }

   private static void case_() {
      catch_ = new byte[]{2};
   }

   private static void implements_() {
      case_ = new boolean[]{true, true, false, false, true, false, true};
   }

   private void protected_() {
      this.private_();
      ((Set)this.protected_[0]).clear();
      Boolean var5 = false;
      this.protected_[1] = var5;
   }

   private void private_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[2];
         Object[] var1 = this.protected_;
         var1[1] = false;
      }
   }
}
