package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLB implements MinecraftAccessor {
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] class_;
   public static Object[] break_;

   public boolean byte_() {
      return (Boolean)this.class_[2];
   }

   public rrLB() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static rrLB class_(rrLS var0, int var1, boolean var2) {
      ((rrLB)break_[0]).class_[0] = var0;
      rrLB var10000 = (rrLB)break_[0];
      Integer var8 = var1;
      var10000.class_[1] = var8;
      var10000 = (rrLB)break_[0];
      Boolean var9 = var2;
      var10000.class_[2] = var9;
      return (rrLB)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, -92, 68, -87, 47, -93, -31, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1292419608;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6992274686413275500L;
   }

   public rrLS class_() {
      return (rrLS)this.class_[0];
   }

   public static void break_(rrLS var0, int var1, boolean var2) {
      rrLB var3 = class_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      if (!var3.byte_()) {
         if (var1 == ((rrIF)ClickGuiTheme.class_[0]).finally_().byte_()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).byte_().int_();
         } else if (var1 == ((Qw_1)import_.class_[20]).T.int_().break_()) {
            import_.break_((rrfk_3)rrfk_3.throws_[0]);
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().class_(var1);
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).class_(var1);
      }
   }

   public int break_() {
      return (Integer)this.class_[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLB()};
      break_ = var0;
   }

   private static void catch_() {
      byte_ = new boolean[]{false, true, false, false, true};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 20, 0, 0, 0, 0, 1, 2};
   }

   private static void protected_() {
      throws_ = new byte[]{3, 2};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = false;
      }
   }
}
