package celestial;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelDecoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Sharable
public class rrjT_2 extends MessageToMessageDecoder<ByteBuf> {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static String[] throws_;

   private static void byte_() {
      byte_ = new boolean[]{false, true, false, false, true, true, false, true, false, false};
   }

   public rrjT_2(UserConnection var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = false;
         var1[2] = false;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -63, 84, -120, -37, 61, -103, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean class_(ChannelHandlerContext var1, ByteBuf var2) throws InvocationTargetException {
      if ((Boolean)this.class_[1]) {
         return false;
      } else {
         int var3 = var1.pipeline().names().indexOf("decompress");
         if (var3 == -1) {
            return false;
         } else {
            Boolean var10 = true;
            this.class_[1] = var10;
            if (var3 > var1.pipeline().names().indexOf("via-decoder")) {
               rrVr.class_(var1, var2);
               ChannelHandler var4 = var1.pipeline().get("via-encoder");
               ChannelHandler var5 = var1.pipeline().get("via-decoder");
               var1.pipeline().remove(var4);
               var1.pipeline().remove(var5);
               var1.pipeline().addAfter("compress", "via-encoder", var4);
               var1.pipeline().addAfter("decompress", "via-decoder", var5);
               return true;
            } else {
               return byte_[6];
            }
         }
      }
   }

   public void class_(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if ((Boolean)this.class_[2]) {
         Boolean var11 = false;
         this.class_[2] = var11;
         var3.add(var2.retain());
      } else if (!((UserConnection)this.class_[0]).checkIncomingPacket()) {
         throw CancelDecoderException.generate(null);
      } else if (!((UserConnection)this.class_[0]).shouldTransformPacket()) {
         var3.add(var2.retain());
      } else {
         ByteBuf var4 = var1.alloc().buffer().writeBytes(var2);

         try {
            boolean var5 = this.class_(var1, var4);
            ((UserConnection)this.class_[break_[5]]).transformIncoming(var4, CancelDecoderException::generate);
            if (var5) {
               rrVr.break_(var1, var4);
               Boolean var12 = byte_[1];
               this.class_[break_[6]] = var12;
            }

            var3.add(var4.retain());
         } finally {
            var4.release();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1450345588;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6376146354399353835L;
   }

   private static void break_() {
      break_ = new short[]{0, 2, 2, 0, 0, 0, 2, 1, 1};
   }

   private static void throws_() {
      protected_ = new byte[]{-1, 3, 2};
   }

   private static void protected_() {
      throws_ = new String[]{
         new String("decompress"),
         new String("via-decoder"),
         new String("via-encoder"),
         new String("via-decoder"),
         new String("compress"),
         new String("via-encoder"),
         new String("decompress"),
         new String("via-decoder")
      };
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      if (!PipelineUtil.containsCause(var2, CancelCodecException.class)) {
         super.exceptionCaught(var1, var2);
      }
   }
}
