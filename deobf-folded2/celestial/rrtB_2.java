package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtB_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;

   private static void id_byte() {
      id_break = new short[6];
   }

   public rrtB_2() {
      this.id_throws();
      HashMap var5 = new HashMap();
      this.id_class[0] = var5;
      this.id_class(rrtE_2::new);
      this.id_class(rrtS_2::new);
      this.id_class(rrtG_2::new);
      this.id_class(rrtM_2::new);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 23, 16, -103, 53, -124, 112, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Map<Integer, Supplier<? extends rrTi_1>> id_class() {
      return (Map<Integer, Supplier<? extends rrTi_1>>)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -320280039564606767L;
   }

   public void id_class(Supplier<? extends rrTi_1> var1) {
      ((Map)this.id_class[0]).put(((Map)this.id_class[0]).size(), var1);
   }

   public void id_class(rrTi_1 var1, Channel var2, boolean var3) throws IOException {
      if (!var3 || !rrLm_1.id_class(var1).id_byte()) {
         int var4 = this.id_class(var1);
         if (var4 == -1) {
            throw new IOException("Unknown packet: " + var1.getClass().getSimpleName());
         } else {
            ByteBuf var5 = Unpooled.buffer();
            var5.writeInt(var4);
            var1.id_class(var5);
            var2.writeAndFlush(new BinaryWebSocketFrame(var5));
         }
      }
   }

   public rrTi_1 id_class(rrtr_3 var1, BinaryWebSocketFrame var2, ChannelHandlerContext var3, boolean var4) throws IOException {
      ByteBuf var5 = var2.content();
      int var6 = var5.readInt();
      rrTi_1 var7 = this.id_class(var6);
      var7.id_break(var5);
      var5.clear();
      QY.id_instanceof().execute(() -> {
         if (var4 && !rrLc_1.id_break(var7).id_byte()) {
            var7.id_class(var1, var3);
         }
      });
      return var7;
   }

   public rrTi_1 id_class(int var1) {
      return (rrTi_1)((Supplier)((Map)this.id_class[0]).get(var1)).get();
   }

   public int id_class(rrTi_1 var1) {
      return ((Map)this.id_class[0])
         .entrySet()
         .stream()
         .filter(var1x -> ((rrTi_1)((Supplier)var1x.getValue()).get()).getClass().equals(var1.getClass()))
         .map(Entry::getKey)
         .findFirst()
         .orElse(-1);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -964366085;
   }

   private static void id_break() {
      id_byte = new boolean[]{true};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{-1, -1};
   }
}
