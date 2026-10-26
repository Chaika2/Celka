package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Popka extends Module {
   private static short[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;
   private static byte[] id_catch;

   public Popka() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_this();
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         this.id_break[0] = 0;
         this.id_break[1] = false;
      }
   }

   @EventTarget
   public void id_class(rrAG var1) {
      this.id_this();
      Integer var6 = 5;
      this.id_break[id_byte[1]] = var6;
      Boolean var7 = true;
      this.id_break[1] = var7;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7296016987662541885L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1135209048;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[3]] && (Boolean)this.id_break[1]) {
         ((cb_3)id_import.id_class[57]).id_protected(id_protected[2]);
         Boolean var6 = id_throws[1];
         this.id_break[1] = var6;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 106, -79, -27, 19, 34, 92, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_this();
      super.id_throws(var1);
      Integer var6 = Integer.valueOf(id_throws[2]);
      this.id_break[id_byte[7]] = var6;
      Boolean var7 = id_throws[3];
      this.id_break[1] = var7;
   }

   private static void id_continue() {
      id_byte = new short[]{0, 0, 1, 0, 1, 57, 1, 0, 1};
   }

   private static void id_else() {
      id_catch = new byte[]{5, 2};
   }

   private static void id_new() {
      id_throws = new boolean[]{true, false, false, false, false, false, true, false};
   }

   private static void id_super() {
      id_protected = new String[]{new String("Popka"), new String(":D"), new String("/warp huhu")};
   }
}
