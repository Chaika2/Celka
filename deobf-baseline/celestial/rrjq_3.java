package celestial;

import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrjq_3 extends ChannelInboundHandlerAdapter {
   private static short[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;
   public static Object[] id_class;
   public Object[] id_break;

   public abstract String id_byte();

   public rrjq_3(UserConnection var1) {
      this.id_implements();
      this.id_break[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 759490069;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1625434132429246818L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -88, 5, 62, -5, 73, -1, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract String id_class();

   public abstract String id_break();

   public abstract String id_throws();

   private static void id_finally() {
      id_throws = new byte[]{2};
   }

   private static void id_catch() {
      id_protected = new String[]{new String("via-decoder"), new String("via-encoder")};
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{id_protected[0], id_protected[1]};
      id_class = var0;
   }

   private static void id_case() {
      id_byte = new short[2];
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[id_case[0]];
         Object[] var1 = this.id_break;
      }
   }

   public UserConnection id_protected() {
      return (UserConnection)this.id_break[id_byte[1]];
   }

   private static void id_private() {
      id_case = new boolean[]{true, false, true};
   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) throws Exception {
      super.userEventTriggered(var1, var2);
   }

   public void handlerAdded(ChannelHandlerContext var1) throws Exception {
      super.handlerAdded(var1);
   }
}
