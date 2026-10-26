package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ItemPhysics extends Module {
   private static float[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static short[] id_catch;

   public ItemPhysics() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_this();
      rrIm_1 var5 = new rrIm_1(id_protected[2], 5.0F, 2.0F, 7.0F, 0.1F);
      this.id_break[id_catch[1]] = var5;
      this.id_class((rrIm_1)this.id_break[id_catch[2]]);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4334536060028415510L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1457275704;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -33, -95, -124, 126, 86, -97, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_byte = new float[]{5.0F, 2.0F, 7.0F, 0.1F};
   }

   private static void id_else() {
      id_protected = new String[]{new String("Item Physics"), new String("Реалистичная физика предметов"), new String("Скорость вращения")};
   }

   public float id_new() {
      this.id_this();
      return ((rrIm_1)this.id_break[id_catch[3]]).id_byte();
   }

   private static void id_return() {
      id_throws = new boolean[]{true};
   }

   private static void id_super() {
      id_catch = new short[]{2, 0, 0, 0};
   }
}
