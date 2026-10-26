package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoReconnect extends Module {
   public Object[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static long[] id_throws;
   private static String[] id_catch;
   private static boolean[] id_private;

   public AutoReconnect() {
      super("Auto Reconnect", "Автоматически перезаходит на\nпоследний игровой режим", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_continue();
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      this.id_continue();
      PI var1 = C_throws.id_byte().id_native().id_protected();
      if (var1 != null) {
         Pf_1 var2 = var1.id_class();
         if (var2.id_break()) {
            String var7 = var2.id_class() + var1.id_break();
            this.id_break[0] = var7;
         } else if (!rql_3.id_break((String)this.id_break[0])
            && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] != 0
            && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 20 == 0) {
            ((cb_3)id_import.id_class[57]).id_case("/" + (String)this.id_break[0]);
         }
      }
   }

   private void id_class(SL var1) {
      this.id_continue();
      String var2 = C_throws.id_byte().id_final().id_throws();
      if (!rql_3.id_break(var2)) {
         this.id_break[0] = var2;
      } else if (!rql_3.id_break((String)this.id_break[0])) {
         var1.id_class(new SF((String)this.id_break[0], 0L));
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.id_class[1] == null) {
            return;
         }

         SL var2 = C_throws.id_byte().id_default();
         if (var2.id_throws()) {
            return;
         }

         switch (((int[])rrlQ_2.id_class[0])[((rrfq_3)rrfp_3.id_class[1]).ordinal()]) {
            case 1:
            case 2:
               this.id_this();
               break;
            case 3:
               this.id_break(var2);
               break;
            case 4:
               this.id_class(var2);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7277647066595262163L;
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_continue();
      Object var6 = null;
      this.id_break[0] = var6;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -448057592;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, -67, 17, 11, 10, -120, -11, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break(SL var1) {
      this.id_continue();
      Po_1 var2 = C_throws.id_byte().P().id_break();
      if (var2 != null) {
         PK var3 = var2.id_break();
         if (var3.id_break()) {
            String var8 = var3.id_class() + var2.id_class();
            this.id_break[0] = var8;
         } else if (!rql_3.id_break((String)this.id_break[0])) {
            var1.id_class(new SF((String)this.id_break[0], 0L));
         }
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_continue();
      super.id_throws(var1);
      Object var6 = null;
      this.id_break[0] = var6;
   }

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_else() {
      id_throws = new long[2];
   }

   private static void id_new() {
      id_private = new boolean[]{true};
   }

   private static void id_return() {
      id_byte = new byte[]{20};
   }

   private static void id_super() {
      id_protected = new short[]{3, 0, 1, 0, 1, 0, 0, 0, 57, 41, 57, 41, 57, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   private static void id_public() {
      id_catch = new String[]{new String("Auto Reconnect"), new String("Автоматически перезаходит на\nпоследний игровой режим")};
   }
}
