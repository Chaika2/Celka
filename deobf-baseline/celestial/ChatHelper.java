package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ChatHelper extends Module {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static short[] id_catch;

   public ChatHelper() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_this();
      rrIk_1 var5 = new rrIk_1(id_protected[2], id_byte[0]);
      this.id_break[id_catch[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_byte[1]);
      this.id_break[id_catch[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_protected[4], id_byte[2]);
      this.id_break[id_catch[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_protected[5], id_byte[3]);
      this.id_break[id_catch[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_byte[4]);
      this.id_break[id_catch[5]] = var9;
      rrHH[] var10001 = new rrHH[id_throws[0]];
      var10001[id_byte[5]] = new rrHC(this);
      var10001[id_byte[6]] = new rrHy_1(this);
      var10001[id_throws[1]] = new rrHn_1(this);
      var10001[id_throws[2]] = new rrHl_1(this);
      rrHH[] var10 = var10001;
      this.id_break[id_catch[6]] = var10;
      Setting[] var11 = new Setting[id_throws[3]];
      byte var10003 = id_byte[7];
      String var10006 = id_protected[7];
      rrIk_1[] var10007 = new rrIk_1[id_throws[4]];
      var10007[id_byte[8]] = (rrIk_1)this.id_break[id_catch[7]];
      var10007[id_byte[9]] = (rrIk_1)this.id_break[id_catch[8]];
      var10007[id_throws[5]] = (rrIk_1)this.id_break[id_catch[9]];
      var10007[id_throws[6]] = (rrIk_1)this.id_break[id_catch[10]];
      var11[var10003] = new rrIc_1(var10006, var10007);
      var11[id_byte[10]] = (rrIk_1)this.id_break[id_catch[11]];
      this.id_class(var11);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3996342898382610264L;
   }

   @EventTarget
   public void id_class(rrFR var1) {
      this.id_this();
      if (((rrIk_1)this.id_break[id_catch[12]]).id_class()) {
         var1.id_class(id_byte[11]);
      }
   }

   @EventTarget
   public void id_class(rrLh_1 var1) {
      this.id_this();
      rgP_2 var2 = var1.id_throws();
      if (!(var2 instanceof rVe_1)) {
         Aw_1 var3 = var1.id_protected();
         if (var3 != null && !var3.id_class().equals(((cb_3)id_import.id_class[id_catch[13]]).sv())) {
            rgN_2 var4 = new rgN_2(id_protected[8]);
            rrHH[] var5 = (rrHH[])this.id_break[id_catch[14]];
            int var6 = var5.length;

            for (int var7 = id_byte[12]; var7 < var6; var7++) {
               rrHH var8 = var5[var7];
               if (var8.id_class()) {
                  var4.id_class(var8.id_class(var3)).id_break(id_protected[9]);
               }
            }

            rVi_1 var9 = var2.id_case();
            if (var9.id_protected().isEmpty()) {
               var9 = var4.id_class(var9);
            } else {
               var9.id_class(id_byte[13], var4);
            }

            var1.id_class(var9);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 881150270;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -113, -4, -61, 39, -75, 25, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_byte = new boolean[]{true, true, false, false, false, false, true, false, false, true, true, true, false, false};
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("Chat Helper"),
         new String("Утилитарный модуль для чата"),
         new String("Call"),
         new String("Invsee"),
         new String("Ah"),
         new String("Duel"),
         new String("Сохранение истории"),
         new String("Быстрые действия"),
         new String(""),
         new String(" ")
      };
   }

   private static void id_new() {
      id_throws = new byte[]{4, 2, 3, 2, 4, 2, 3, 6};
   }

   private static void id_super() {
      id_catch = new short[]{4, 0, 1, 2, 3, 4, 5, 1, 0, 3, 2, 4, 4, 57, 5};
   }
}
