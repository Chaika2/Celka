package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RenderEvent {
   public Object[] class_;
   private static short[] byte_;
   public static Object[] break_;
   private static float[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;

   public float byte_() {
      return (Float)this.class_[2];
   }

   public RenderEvent() {
      this.implements_();
   }

   static {
      ntfClinit();
   }

   public Ml_1 class_() {
      return (Ml_1)this.class_[0];
   }

   public static void class_(Ml_1 var0, rjV_2 var1, float var2) {
      RenderEvent var3 = break_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -860559552;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4877203622659303421L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 117, 45, 89, 115, -112, 26, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rjV_2 break_() {
      return (rjV_2)this.class_[1];
   }

   public static RenderEvent break_(Ml_1 var0, rjV_2 var1, float var2) {
      ((RenderEvent)break_[0]).class_[0] = var0;
      ((RenderEvent)break_[0]).class_[1] = var1;
      RenderEvent var10000 = (RenderEvent)break_[0];
      Float var9 = var2;
      var10000.class_[2] = var9;
      return (RenderEvent)break_[0];
   }

   private static void throws_() {
      throws_ = new byte[]{3, 2};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new RenderEvent()};
      break_ = var0;
   }

   private static void case_() {
      protected_ = new float[1];
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = 0.0F;
      }
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void private_() {
      case_ = new boolean[]{false, true};
   }
}
