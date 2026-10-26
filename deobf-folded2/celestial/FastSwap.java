package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FastSwap extends Module {
   public Object[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;

   public FastSwap() {
      super("Fast Swap", "Меняет предмет в основной руке", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_super();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      rrCQ var6 = this.id_class(new rrCQ(this));
      this.id_break[1] = var6;
      rrCl_1 var7 = this.id_class(new rrCl_1(this));
      this.id_break[2] = var7;
      rrCc_1 var8 = this.id_class(new rrCc_1(this));
      this.id_break[3] = var8;
      rrCm_1 var9 = this.id_class(new rrCm_1(this));
      this.id_break[4] = var9;
      rrCL var10 = this.id_class(new rrCL(this));
      this.id_break[5] = var10;
      rrCn_1 var11 = this.id_class(new rrCn_1(this));
      this.id_break[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new String[]{new String("Fast Swap"), new String("Меняет предмет в основной руке")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1441733385;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5758067580203938874L;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_super();
      super.id_class(var1);

      for (rrTF var3 : (List)this.id_break[0]) {
         var3.aI_();
      }
   }

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_super();
      ((List)this.id_break[0]).add(var1);
      return (T)var1;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 97, 118, -80, 53, 52, -23, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);

      for (rrTF var3 : (List)this.id_break[0]) {
         var3.aK_();
      }
   }

   private static void id_continue() {
      id_byte = new byte[]{7};
   }

   private static void id_new() {
      id_protected = new short[]{0, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }
}
