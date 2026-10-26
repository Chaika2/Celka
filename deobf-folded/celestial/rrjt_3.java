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
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new boolean[]{false, false, true, true, false, true, false};
   }

   public rrjt_3(UserConnection var1) {
      this.id_break();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private boolean id_class(ChannelHandlerContext var1, ByteBuf var2) throws InvocationTargetException {
      if ((Boolean)this.id_class[1]) {
         return id_protected[0];
      } else {
         int var3 = var1.pipeline().names().indexOf(id_throws[0]);
         if (var3 == -1) {
            return id_protected[1];
         } else {
            Boolean var10 = true;
            this.id_class[1] = var10;
            if (var3 > var1.pipeline().names().indexOf(id_throws[1])) {
               rrVr.id_class(var1, var2);
               ChannelHandler var4 = var1.pipeline().get(id_throws[2]);
               ChannelHandler var5 = var1.pipeline().get(id_throws[3]);
               var1.pipeline().remove(var4);
               var1.pipeline().remove(var5);
               var1.pipeline().addAfter(id_throws[4], id_throws[5], var4);
               var1.pipeline().addAfter(id_throws[6], id_throws[7], var5);
               return true;
            } else {
               return id_protected[4];
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3272050382353478225L;
   }

   public void id_class(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (!((UserConnection)this.id_class[id_byte[1]]).checkOutgoingPacket()) {
         throw CancelEncoderException.generate(null);
      } else if (!((UserConnection)this.id_class[id_byte[2]]).shouldTransformPacket()) {
         var3.add(var2.retain());
      } else {
         ByteBuf var4 = var1.alloc().buffer().writeBytes(var2);

         try {
            boolean var5 = this.id_class(var1, var4);
            UserConnection var10000 = (UserConnection)this.id_class[id_byte[3]];
            ViaProtocolDiagnostics.traceOutgoingBefore((UserConnection)this.id_class[id_byte[3]], var4);
            var10000.transformOutgoing(var4, CancelEncoderException::generate);
            ViaProtocolDiagnostics.traceOutgoingAfter(var4);
            if (var5) {
               rrVr.id_break(var1, var4);
            }

            var3.add(var4.retain());
         } finally {
            var4.release();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -315085428;
   }

   private static void id_class() {
      id_break = new byte[]{-1, 2};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -128, -41, -35, 93, -9, -34, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = id_protected[6];
      }
   }

   private static void id_throws() {
      id_throws = new String[]{
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

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 0, 1, 1};
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      if (!PipelineUtil.containsCause(var2, CancelCodecException.class)) {
         super.exceptionCaught(var1, var2);
      }
   }
}
