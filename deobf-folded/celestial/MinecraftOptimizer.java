package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MinecraftOptimizer extends Module {
   private static String[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;
   private static short[] id_catch;
   private static boolean[] id_private;
   public static Object[] id_byte;

   public MinecraftOptimizer() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_return();
      rrIk_1 var5 = new rrIk_1(id_protected[2], true);
      this.id_break[id_catch[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_private[1]);
      this.id_break[1] = var6;
      String var10003 = id_protected[4];
      rrIk_1[] var10004 = new rrIk_1[2];
      var10004[id_private[2]] = (rrIk_1)this.id_break[id_catch[3]];
      var10004[1] = (rrIk_1)this.id_break[1];
      this.id_class(new rrIc_1(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{4, 0, 1, 0, 1, 0, 1};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -177897343;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 507960844333435528L;
   }

   @EventTarget
   public void id_class(rrAe_1 var1) {
      var1.id_class(true);
   }

   @EventTarget
   public void id_class(rrnb_3 var1) {
      this.id_return();
      ao_3 var2 = var1.id_class();
      if (((rrIk_1)this.id_break[id_catch[5]]).id_class() && var2 instanceof rHb_1) {
         var1.id_class(true);
      } else if (((rrIk_1)this.id_break[1]).id_class() && var2 instanceof rsG_2) {
         var1.id_class(true);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 55, 9, 40, -83, -20, 49, -48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new String[]{
         new String("Minecraft Optimizer"),
         new String("Оптимизирует майнкрафт"),
         new String("Баннеры"),
         new String("Рамки"),
         new String("Убирать"),
         new String("Optimizer"),
         new String("Optimizer")
      };
   }

   private static void id_else() {
      id_throws = new byte[]{2, 2};
   }

   private static void id_new() {
      id_private = new boolean[]{true, false, false, true, true, true, true, true, false};
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   private static void id_super() {
      Object[] var0 = new Object[]{id_protected[6]};
      id_byte = var0;
   }

   @Override
   public String id_final() {
      return id_protected[5];
   }
}
