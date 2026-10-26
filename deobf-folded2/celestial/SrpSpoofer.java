package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SrpSpoofer extends Module {
   private static String[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;

   public SrpSpoofer() {
      super("SRP Spoofer", "Убирает ресурспак на серверах\nгде это запрещено", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_new();
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new String[]{
         new String("SRP Spoofer"), new String("Убирает ресурспак на серверах\nгде это запрещено"), new String("Ресурспак успешно подменён")
      };
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_new();
      if (var1.id_class() instanceof rZQ var2 && var2.id_break() == rZN.DECLINED) {
         var2.id_class(rZN.ACCEPTED);
         Boolean var8 = true;
         this.id_break[0] = var8;
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[0]) {
         this.id_return();
         this.id_continue();
         Boolean var6 = false;
         this.id_break[0] = var6;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 283642576;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7349062650280530281L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -27, -107, 96, 47, 39, 43, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      Boolean var6 = false;
      this.id_break[0] = var6;
   }

   private void id_continue() {
      String var1 = "Ресурспак успешно подменён";
      rrfu_3.id_byte(rrfu_3.id_class((Module)this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtQ_2(this.id_final(), var1, 3000));
   }

   private static void id_else() {
      id_throws = new short[]{4, 0, 0, 0, 0, 0, 57, 0, 0, 3000};
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         this.id_break[0] = false;
      }
   }

   private void id_return() {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(rZN.SUCCESSFULLY_LOADED);
   }

   private static void id_super() {
      id_protected = new boolean[]{true, false, false, true, false, false};
   }
}
