package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ChestStealer extends Module {
   private static byte[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static String[] id_throws;

   public ChestStealer() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.id_else();
      rrlY_2 var5 = new rrlY_2(this);
      this.id_break[id_protected[1]] = var5;
      rrlY_2 var6 = (rrlY_2)this.id_break[id_protected[2]];
      this.id_break[id_protected[3]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new short[]{3, 1, 1, 0, 0};
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2245457121105690902L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 684768188;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, 22, -3, -64, 62, -2, 21, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }
   }

   private static void id_continue() {
      id_throws = new String[]{new String("Chest Stealer"), new String("Автоматически забирает ресурсы\nиз сундука")};
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   public rrTF<ChestStealer> id_new() {
      this.id_else();
      return (rrTF<ChestStealer>)this.id_break[id_protected[4]];
   }

   private static void id_super() {
      id_byte = new byte[]{2};
   }
}
