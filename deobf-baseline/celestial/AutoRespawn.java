package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoRespawn extends Module {
   private static String[] id_byte;
   private static byte[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static short[] id_catch;

   private boolean id_byte(String var1) {
      return !var1.isEmpty() && !var1.isBlank() ? id_throws[7] : id_throws[8];
   }

   public AutoRespawn() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_new();
      rrIv_1 var5 = new rrIv_1(id_byte[2], rrte_3.id_class((Pattern)rrtR_2.id_class[id_catch[1]]));
      this.id_break[id_catch[2]] = var5;
      this.id_class((rrIv_1)this.id_break[id_catch[3]]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new String[]{new String("Auto Respawn"), new String("Автоматически респавнит вас\nпосле смерти"), new String("Сообщение после респавна")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 719655780;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[4]] && (Boolean)this.id_break[id_catch[5]]) {
         if ((vm_3)id_import.id_class[id_catch[6]] instanceof ZS && (Integer)((cb_3)id_import.id_class[id_catch[7]]).id_private[id_catch[8]] == id_throws[0]) {
            ((cb_3)id_import.id_class[id_catch[9]]).J();
         } else if (((cb_3)id_import.id_class[id_catch[10]]).Pu()) {
            int var10002 = (Integer)this.id_break[id_catch[11]] + id_throws[1];
            Integer var7 = var10002;
            this.id_break[id_catch[12]] = var7;
            if (var10002 >= id_protected[0]) {
               String var2 = ((rrIv_1)this.id_break[id_catch[13]]).id_extends();
               if (this.id_byte(var2)) {
                  ((cb_3)id_import.id_class[id_catch[14]]).id_protected(var2);
               }

               Boolean var8 = id_throws[2];
               this.id_break[id_catch[15]] = var8;
               Integer var9 = Integer.valueOf(id_throws[3]);
               this.id_break[id_catch[16]] = var9;
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7363245691509839040L;
   }

   @EventTarget
   public void id_class(rrAG var1) {
      this.id_new();
      Boolean var6 = id_throws[4];
      this.id_break[id_catch[17]] = var6;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -94, 88, 1, -118, 22, -54, -69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      Boolean var6 = id_throws[5];
      this.id_break[id_catch[18]] = var6;
      Integer var7 = Integer.valueOf(id_throws[6]);
      this.id_break[id_catch[19]] = var7;
   }

   private static void id_continue() {
      id_protected = new byte[]{17, 3, 2};
   }

   private static void id_else() {
      id_catch = new short[]{3, 5, 0, 0, 0, 1, 73, 57, 13, 57, 57, 2, 2, 0, 57, 1, 2, 1, 1, 2};
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[1] = false;
         this.id_break[2] = 0;
      }
   }

   private static void id_super() {
      id_throws = new boolean[]{true, true, false, false, true, false, false, true, false, true, false, false};
   }
}
