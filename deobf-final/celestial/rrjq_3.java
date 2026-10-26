package celestial;

import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrjq_3 extends ChannelInboundHandlerAdapter {
   private static short[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;
   public static Object[] class_;
   public Object[] break_;

   public abstract String byte_();

   public rrjq_3(UserConnection var1) {
      this.implements_();
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 759490069;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1625434132429246818L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -88, 5, 62, -5, 73, -1, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract String class_();

   public abstract String break_();

   public abstract String throws_();

   private static void finally_() {
      throws_ = new byte[]{2};
   }

   private static void catch_() {
      protected_ = new String[]{new String("via-decoder"), new String("via-encoder")};
   }

   private static void extends_() {
      Object[] var0 = new Object[]{"via-decoder", "via-encoder"};
      class_ = var0;
   }

   private static void case_() {
      byte_ = new short[2];
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   public UserConnection protected_() {
      return (UserConnection)this.break_[0];
   }

   private static void private_() {
      case_ = new boolean[]{true, false, true};
   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) throws Exception {
      super.userEventTriggered(var1, var2);
   }

   public void handlerAdded(ChannelHandlerContext var1) throws Exception {
      super.handlerAdded(var1);
   }
}
