package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GuiMove extends Module {
   private static short[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;
   private static long[] id_catch;
   private static byte[] id_private;

   public GuiMove() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_while();
      String var10003 = id_protected[2];
      String var10004 = id_protected[3];
      String[] var10005 = new String[id_private[0]];
      var10005[id_throws[0]] = id_protected[4];
      var10005[id_throws[1]] = id_protected[5];
      var10005[id_private[1]] = id_protected[6];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_byte[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[7], id_throws[2]);
      this.id_break[id_byte[2]] = var6;
      Setting[] var10001 = new Setting[id_private[2]];
      var10001[id_throws[3]] = (rrIQ)this.id_break[id_byte[3]];
      var10001[id_throws[4]] = (rrIk_1)this.id_break[id_byte[4]];
      this.id_class(var10001);
      rrHr_1 var7 = new rrHr_1(this);
      this.id_break[id_byte[5]] = var7;
      rrHB var8 = new rrHB(this);
      this.id_break[id_byte[6]] = var8;
      rrHS var9 = new rrHS(this);
      this.id_break[id_byte[7]] = var9;
      rrHB var10 = (rrHB)this.id_break[id_byte[8]];
      this.id_break[id_byte[9]] = var10;
      ((rrIQ)this.id_break[id_byte[10]]).id_class(id_protected[8], (var1, var2) -> {
         this.id_while();
         if ((rrli_3)this.id_break[id_byte[32]] != null && this.aJ_()) {
            ((rrli_3)this.id_break[id_byte[33]]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = id_private[3];
         switch (var3.hashCode()) {
            case -654193598:
               if (var3.equals(id_protected[9])) {
                  var4 = id_throws[12];
               }
               break;
            case 1155506348:
               if (var3.equals(id_protected[10])) {
                  var4 = id_throws[13];
               }
               break;
            case 1897755483:
               if (var3.equals(id_protected[11])) {
                  var4 = id_private[4];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrHr_1)this.id_break[id_byte[34]];
            case 1 -> (rrHB)this.id_break[id_byte[35]];
            case 2 -> (rrHS)this.id_break[id_byte[36]];
            default -> null;
         };
         this.id_break[id_byte[37]] = var9x;
         if ((rrli_3)this.id_break[id_byte[38]] != null && this.aJ_()) {
            ((rrli_3)this.id_break[id_byte[39]]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new byte[]{3, 2, 2, -1, 2, 7, 6};
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1216617370;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[11]]) {
         if (!this.id_super()) {
            Long var6 = System.currentTimeMillis();
            this.id_break[id_byte[12]] = var6;
         }

         if ((vm_3)id_import.id_class[id_byte[13]] == null) {
            return;
         }

         if (this.id_class((vm_3)id_import.id_class[id_byte[14]])) {
            this.id_class(var0 -> id_throws[11]);
            return;
         }

         this.id_class(var0 -> rrfC_2.id_break(var0.id_int().id_break()));
         if (((rhx_3)((cb_3)id_import.id_class[id_byte[15]]).id_implements[id_byte[16]]).id_break && !((cb_3)id_import.id_class[id_byte[17]]).BL()) {
            ((Qw_1)id_import.id_class[id_byte[18]]).k.id_class(rrfC_2.id_break(((Qw_1)id_import.id_class[id_byte[19]]).k.id_int().id_break()));
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7599234538623721953L;
   }

   private void id_class(Function<Vu_1, Boolean> var1) {
      Vu_1[] var2 = ((Qw_1)id_import.id_class[id_byte[30]]).Pj;
      int var3 = var2.length;

      for (int var4 = id_throws[9]; var4 < var3; var4++) {
         Vu_1 var5 = var2[var4];
         var5.id_class((Boolean)var1.apply(var5));
      }
   }

   private boolean id_class(vm_3 var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[id_byte[20]]).id_class()
         || !((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[id_byte[21]]).id_break() && !vs_3.INSTANCE.id_break()) {
         return ((rrli_3)this.id_break[id_byte[22]]).id_class(var1) ? id_throws[6] : id_throws[7];
      } else {
         return id_throws[5];
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, 24, -125, 121, 27, -2, -70, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }

      this.id_class(var0 -> id_throws[10]);
   }

   private static void id_goto() {
      id_byte = new short[]{3, 0, 1, 0, 1, 2, 3, 4, 3, 5, 0, 0, 6, 73, 73, 57, 18, 57, 20, 20, 1, 0, 5, 5, 5, 3, 3, 5, 2, 2, 20, 6, 5, 5, 2, 3, 4, 5, 5, 5};
   }

   public long id_continue() {
      this.id_while();
      return (Long)this.id_break[id_byte[31]];
   }

   private static void id_else() {
      id_catch = new long[1];
   }

   public rrTF<GuiMove> id_new() {
      this.id_while();
      return (rrli_3)this.id_break[id_byte[23]];
   }

   private static void id_return() {
      id_throws = new boolean[]{false, true, true, false, true, true, true, false, true, false, false, false, false, true};
   }

   public boolean id_super() {
      this.id_while();
      if ((rrli_3)this.id_break[id_byte[24]] == (rrHB)this.id_break[id_byte[25]]) {
         return ((rrHB)this.id_break[id_byte[26]]).id_class();
      } else {
         return (rrli_3)this.id_break[id_byte[27]] == (rrHr_1)this.id_break[id_byte[28]] ? ((rrHr_1)this.id_break[id_byte[29]]).id_class() : id_throws[8];
      }
   }

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         this.id_break[6] = 0L;
      }
   }

   private static void id_public() {
      id_protected = new String[]{
         new String("Gui Move"),
         new String("Позволяет ходить в открытых\nконтейнерах"),
         new String("Режим"),
         new String("Advanced"),
         new String("Advanced"),
         new String("Funtime"),
         new String("Vanilla"),
         new String("Не в текстовых полях"),
         new String("change_mode"),
         new String("Advanced"),
         new String("Funtime"),
         new String("Vanilla")
      };
   }
}
