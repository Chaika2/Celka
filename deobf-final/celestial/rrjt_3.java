package celestial;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelEncoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import offline.launcher.ViaProtocolDiagnostics;

@Sharable
public class rrjt_3 extends MessageToMessageEncoder<ByteBuf> {
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new boolean[]{false, false, true, true, false, true, false};
   }

   public rrjt_3(UserConnection var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private boolean class_(ChannelHandlerContext var1, ByteBuf var2) throws InvocationTargetException {
      if ((Boolean)this.class_[1]) {
         return false;
      } else {
         int var3 = var1.pipeline().names().indexOf("compress");
         if (var3 == -1) {
            return false;
         } else {
            Boolean var10 = true;
            this.class_[1] = var10;
            if (var3 > var1.pipeline().names().indexOf("via-encoder")) {
               rrVr.class_(var1, var2);
               ChannelHandler var4 = var1.pipeline().get("via-encoder");
               ChannelHandler var5 = var1.pipeline().get("via-decoder");
               var1.pipeline().remove(var4);
               var1.pipeline().remove(var5);
               var1.pipeline().addAfter("compress", "via-encoder", var4);
               var1.pipeline().addAfter("decompress", "via-decoder", var5);
               return true;
            } else {
               return protected_[4];
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3272050382353478225L;
   }

   public void class_(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (!((UserConnection)this.class_[0]).checkOutgoingPacket()) {
         throw CancelEncoderException.generate(null);
      } else if (!((UserConnection)this.class_[0]).shouldTransformPacket()) {
         var3.add(var2.retain());
      } else {
         ByteBuf var4 = var1.alloc().buffer().writeBytes(var2);

         try {
            boolean var5 = this.class_(var1, var4);
            UserConnection var10000 = (UserConnection)this.class_[byte_[3]];
            ViaProtocolDiagnostics.traceOutgoingBefore((UserConnection)this.class_[byte_[3]], var4);
            var10000.transformOutgoing(var4, CancelEncoderException::generate);
            ViaProtocolDiagnostics.traceOutgoingAfter(var4);
            if (var5) {
               rrVr.break_(var1, var4);
            }

            var3.add(var4.retain());
         } finally {
            var4.release();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -315085428;
   }

   private static void class_() {
      break_ = new byte[]{-1, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -128, -41, -35, 93, -9, -34, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("compress"),
         new String("via-encoder"),
         new String("via-encoder"),
         new String("via-decoder"),
         new String("compress"),
         new String("via-encoder"),
         new String("decompress"),
         new String("via-decoder")
      };
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 0, 1, 1};
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      if (!PipelineUtil.containsCause(var2, CancelCodecException.class)) {
         super.exceptionCaught(var1, var2);
      }
   }
}
