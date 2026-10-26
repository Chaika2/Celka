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
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;

   private static void id_byte() {
      id_byte = new boolean[]{false, true, false, false, true, true, false, true, false, false};
   }

   public rrjT_2(UserConnection var1) {
      this.id_class();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[1]];
         Object[] var1 = this.id_class;
         var1[id_byte[7]] = id_byte[8];
         var1[id_protected[2]] = id_byte[9];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -63, 84, -120, -37, 61, -103, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_class(ChannelHandlerContext var1, ByteBuf var2) throws InvocationTargetException {
      if ((Boolean)this.id_class[id_break[7]]) {
         return id_byte[2];
      } else {
         int var3 = var1.pipeline().names().indexOf(id_throws[0]);
         if (var3 == id_protected[0]) {
            return id_byte[3];
         } else {
            Boolean var10 = id_byte[4];
            this.id_class[id_break[8]] = var10;
            if (var3 > var1.pipeline().names().indexOf(id_throws[1])) {
               rrVr.id_class(var1, var2);
               ChannelHandler var4 = var1.pipeline().get(id_throws[2]);
               ChannelHandler var5 = var1.pipeline().get(id_throws[3]);
               var1.pipeline().remove(var4);
               var1.pipeline().remove(var5);
               var1.pipeline().addAfter(id_throws[4], id_throws[5], var4);
               var1.pipeline().addAfter(id_throws[6], id_throws[7], var5);
               return id_byte[5];
            } else {
               return id_byte[6];
            }
         }
      }
   }

   public void id_class(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if ((Boolean)this.id_class[id_break[1]]) {
         Boolean var11 = id_byte[0];
         this.id_class[id_break[2]] = var11;
         var3.add(var2.retain());
      } else if (!((UserConnection)this.id_class[id_break[3]]).checkIncomingPacket()) {
         throw CancelDecoderException.generate(null);
      } else if (!((UserConnection)this.id_class[id_break[4]]).shouldTransformPacket()) {
         var3.add(var2.retain());
      } else {
         ByteBuf var4 = var1.alloc().buffer().writeBytes(var2);

         try {
            boolean var5 = this.id_class(var1, var4);
            ((UserConnection)this.id_class[id_break[5]]).transformIncoming(var4, CancelDecoderException::generate);
            if (var5) {
               rrVr.id_break(var1, var4);
               Boolean var12 = id_byte[1];
               this.id_class[id_break[6]] = var12;
            }

            var3.add(var4.retain());
         } finally {
            var4.release();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1450345588;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6376146354399353835L;
   }

   private static void id_break() {
      id_break = new short[]{0, 2, 2, 0, 0, 0, 2, 1, 1};
   }

   private static void id_throws() {
      id_protected = new byte[]{-1, 3, 2};
   }

   private static void id_protected() {
      id_throws = new String[]{
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
