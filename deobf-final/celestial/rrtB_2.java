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
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static byte[] protected_;

   private static void byte_() {
      break_ = new short[6];
   }

   public rrtB_2() {
      this.throws_();
      HashMap var5 = new HashMap();
      this.class_[0] = var5;
      this.class_(rrtE_2::new);
      this.class_(rrtS_2::new);
      this.class_(rrtG_2::new);
      this.class_(rrtM_2::new);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 23, 16, -103, 53, -124, 112, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Map<Integer, Supplier<? extends rrTi_1>> class_() {
      return (Map<Integer, Supplier<? extends rrTi_1>>)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -320280039564606767L;
   }

   public void class_(Supplier<? extends rrTi_1> var1) {
      ((Map)this.class_[0]).put(((Map)this.class_[0]).size(), var1);
   }

   public void class_(rrTi_1 var1, Channel var2, boolean var3) throws IOException {
      if (!var3 || !rrLm_1.class_(var1).byte_()) {
         int var4 = this.class_(var1);
         if (var4 == -1) {
            throw new IOException("Unknown packet: " + var1.getClass().getSimpleName());
         } else {
            ByteBuf var5 = Unpooled.buffer();
            var5.writeInt(var4);
            var1.class_(var5);
            var2.writeAndFlush(new BinaryWebSocketFrame(var5));
         }
      }
   }

   public rrTi_1 class_(rrtr_3 var1, BinaryWebSocketFrame var2, ChannelHandlerContext var3, boolean var4) throws IOException {
      ByteBuf var5 = var2.content();
      int var6 = var5.readInt();
      rrTi_1 var7 = this.class_(var6);
      var7.break_(var5);
      var5.clear();
      QY.instanceof_().execute(() -> {
         if (var4 && !rrLc_1.break_(var7).byte_()) {
            var7.class_(var1, var3);
         }
      });
      return var7;
   }

   public rrTi_1 class_(int var1) {
      return (rrTi_1)((Supplier)((Map)this.class_[0]).get(var1)).get();
   }

   public int class_(rrTi_1 var1) {
      return ((Map)this.class_[0])
         .entrySet()
         .stream()
         .filter(var1x -> ((rrTi_1)((Supplier)var1x.getValue()).get()).getClass().equals(var1.getClass()))
         .map(Entry::getKey)
         .findFirst()
         .orElse(-1);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -964366085;
   }

   private static void break_() {
      byte_ = new boolean[]{true};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new byte[]{-1, -1};
   }
}
