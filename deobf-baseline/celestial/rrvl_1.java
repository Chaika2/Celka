package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.MutablePair;

public class rrvl_1<L, R> extends MutablePair<L, R> {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new byte[]{4};
   }

   public rrvl_1(L var1, R var2) {
      super(var1, var2);
      this.id_protected();
      Consumer var7 = var0 -> {
      };
      this.id_class[id_byte[0]] = var7;
      Consumer var8 = var0 -> {
      };
      this.id_class[id_byte[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7798686029607607053L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1051788039;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 100, -8, -29, 4, 64, 127, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(L var1, boolean var2) {
      super.setLeft(var1);
      if (var2 && this.id_class[id_byte[2]] != var1) {
         ((Consumer)this.id_class[id_byte[3]]).accept(var1);
      }

      this.id_class[id_byte[4]] = var1;
   }

   public rrvl_1<L, R> id_class(Consumer<R> var1) {
      this.id_class[id_byte[9]] = var1;
      return this;
   }

   private static void id_class() {
      id_protected = new boolean[]{true, true};
   }

   private static void id_break() {
      id_byte = new short[]{2, 3, 0, 2, 0, 1, 3, 1, 2, 3};
   }

   public rrvl_1<L, R> id_break(Consumer<L> var1) {
      this.id_class[id_byte[8]] = var1;
      return this;
   }

   public void id_break(R var1, boolean var2) {
      super.setRight(var1);
      if (var2 && this.id_class[id_byte[5]] != var1) {
         ((Consumer)this.id_class[id_byte[6]]).accept(var1);
      }

      this.id_class[id_byte[7]] = var1;
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   public void setLeft(L var1) {
      this.id_class((L)var1, id_protected[0]);
   }

   public void setRight(R var1) {
      this.id_break((R)var1, id_protected[1]);
   }
}
