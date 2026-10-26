package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PacketEvent {
   public Object[] class_;
   public static Object[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;

   public rfH_2 byte_() {
      return (rfH_2)this.class_[0];
   }

   public PacketEvent() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static PacketEvent class_(rfH_2 var0, xc_3 var1, boolean var2) {
      ((PacketEvent)break_[0]).class_[0] = var0;
      ((PacketEvent)break_[0]).class_[1] = var1;
      PacketEvent var10000 = (PacketEvent)break_[0];
      Boolean var9 = var2;
      var10000.class_[2] = var9;
      return (PacketEvent)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, 123, 12, -13, 87, 41, -40, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4215491972428475281L;
   }

   public xc_3 class_() {
      return (xc_3)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 618046214;
   }

   public boolean break_() {
      return (Boolean)this.class_[2];
   }

   public static PacketEvent break_(rfH_2 var0, xc_3 var1, boolean var2) {
      PacketEvent var3 = class_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
      return var3;
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new PacketEvent()};
      break_ = var0;
   }

   private static void catch_() {
      protected_ = new boolean[]{false, false, true};
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }

   private static void private_() {
      byte_ = new byte[]{3, 2};
   }
}
