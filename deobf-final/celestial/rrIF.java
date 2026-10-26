package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIF extends Setting<KeyBind> {
   public Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;

   private static void int_() {
      throws_ = new byte[]{5};
   }

   public rrIF(String var1, KeyBind var2) {
      super(var1, var2);
      this.package_();
      Boolean var7 = true;
      this.break_[1] = var7;
      BiConsumer var8 = (var0, var1x) -> {
      };
      this.break_[4] = var8;
      this.class_[0] = var1;
      Supplier var10 = () -> var2;
      this.break_[0] = var10;
      rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      this.break_[2] = var11;
      rrZO var12 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      this.break_[3] = var12;
   }

   public rrIF(String var1, KeyBind var2, rrZO var3, rrZO var4) {
      this(var1, var2);
      this.break_[2] = var3;
      this.break_[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1797381854;
   }

   public rrIF class_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[1] = var6;
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1083459702013190352L;
   }

   public void class_(KeyBind var1, boolean var2, boolean var3) {
      this.package_();
      if (var1 != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0] || (Boolean)this.break_[1]) {
         Supplier var8 = () -> var1;
         this.break_[0] = var8;
         if (var3) {
            ((BiConsumer)this.break_[4]).accept(var1, var2);
         }
      }
   }

   public BiConsumer<KeyBind, Boolean> class_() {
      this.package_();
      return (BiConsumer<KeyBind, Boolean>)this.break_[4];
   }

   public rrIF class_(BiConsumer<KeyBind, Boolean> var1) {
      this.package_();
      this.break_[4] = var1;
      return this;
   }

   public rrIF break_(Supplier<KeyBind> var1) {
      this.package_();
      if (var1.get() == (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0] && !(Boolean)this.break_[1]) {
         return this;
      } else {
         this.break_[0] = var1;
         return this;
      }
   }

   public boolean break_() {
      return (vm_3)QY.instanceof_().class_[73] == null && rrfC_2.break_(this.finally_().byte_()) ? true : protected_[2];
   }

   public KeyBind finally_() {
      this.package_();
      return (KeyBind)((Supplier)this.break_[0]).get();
   }

   public rrZO extends_() {
      this.package_();
      return (rrZO)this.break_[2];
   }

   private static void new_() {
      protected_ = new boolean[]{true, true, false, true, false};
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[1] = false;
      }
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 23, -38, 96, 86, -9, 36, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      byte_ = new short[]{1, 4, 0, 0, 0, 2, 0, 3, 2, 3, 0, 0, 1, 0, 4, 0, 1, 0, 4, 1, 2, 3, 73, 1, 4};
   }

   public boolean volatile_() {
      this.package_();
      return (Boolean)this.break_[1];
   }

   public rrZO native_() {
      this.package_();
      return (rrZO)this.break_[3];
   }
}
