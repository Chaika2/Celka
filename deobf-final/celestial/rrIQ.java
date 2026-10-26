package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIQ extends Setting<String> implements rrtf_3<String> {
   public Object[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   public rrIQ(String var1, String var2, String... var3) {
      super(var1, var2);
      this.package_();
      rrIN var8 = (rrIN)rrIN.staticFields6143465a63de38df9c2f3f3e8f0ab649[0];
      this.break_[2] = var8;
      this.class_[0] = var1;
      List var10 = Arrays.asList(var3);
      this.break_[0] = var10;
      Integer var11 = ((List)this.break_[0]).indexOf(var2);
      this.break_[1] = var11;
   }

   static {
      ntfClinit();
   }

   public void class_(String var1, boolean var2) {
      this.package_();
      if (!((List)this.break_[0]).contains(var1)) {
         this.class_((String)((List)this.break_[0]).get(0), var2, true);
         Integer var7 = 0;
         this.break_[1] = var7;
      } else {
         this.class_(var1, var2, true);
         Integer var8 = ((List)this.break_[0]).indexOf(var1);
         this.break_[1] = var8;
      }
   }

   public rrIQ class_(rrIN var1) {
      this.package_();
      this.break_[2] = var1;
      return this;
   }

   @Override
   public List<String> class_() {
      this.package_();
      return (List<String>)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -912786178;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5893585851365448388L;
   }

   @Override
   public Setting<String> break_() {
      return this;
   }

   public rrIN finally_() {
      this.package_();
      return (rrIN)this.break_[2];
   }

   public String extends_() {
      this.package_();
      return (String)((List)this.break_[0]).get((Integer)this.break_[1]);
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[1] = 0;
      }
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 16, 109, -32, -119, 44, 49, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      byte_ = new byte[]{3};
   }

   private static void volatile_() {
      protected_ = new short[]{0, 2, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 2, 2};
   }

   private static void native_() {
      throws_ = new boolean[]{false, true, false, true, true, false};
   }
}
