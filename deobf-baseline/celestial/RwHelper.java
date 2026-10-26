package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RwHelper extends Module {
   private static float[] id_byte;
   public Object[] id_break;
   private static long[] id_protected;
   private static String[] id_throws;
   private static byte[] id_catch;
   private static short[] id_private;
   private static boolean[] id_implements;

   public RwHelper() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_private[0]]);
      this.id_super();
      rrIk_1 var5 = new rrIk_1(id_throws[2], id_implements[0]);
      this.id_break[id_private[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_throws[3], id_implements[1]);
      this.id_break[id_private[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_throws[4], id_implements[2]);
      this.id_break[id_private[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_throws[5], id_implements[3]);
      this.id_break[id_private[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_throws[6], id_implements[4]);
      this.id_break[id_private[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_throws[7], id_implements[5]);
      this.id_break[id_private[6]] = var10;
      CopyOnWriteArrayList var11 = new CopyOnWriteArrayList();
      this.id_break[id_private[7]] = var11;
      Setting[] var10001 = new Setting[id_catch[0]];
      byte var10003 = id_implements[6];
      String var10006 = id_throws[8];
      rrIk_1[] var10007 = new rrIk_1[id_catch[1]];
      var10007[id_implements[7]] = (rrIk_1)this.id_break[id_private[8]];
      var10007[id_implements[8]] = (rrIk_1)this.id_break[id_private[9]];
      var10007[id_catch[2]] = (rrIk_1)this.id_break[id_private[10]];
      var10001[var10003] = new rrIc_1(var10006, var10007);
      var10003 = id_implements[9];
      var10006 = id_throws[9];
      var10007 = new rrIk_1[id_catch[3]];
      var10007[id_implements[10]] = (rrIk_1)this.id_break[id_private[11]];
      var10007[id_implements[11]] = (rrIk_1)this.id_break[id_private[12]];
      var10007[id_catch[4]] = (rrIk_1)this.id_break[id_private[13]];
      var10001[var10003] = new rrIc_1(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new float[]{0.0F, 1.061F, 1.199F, 0.56F, 1.199F};
   }

   @EventTarget
   public void id_class(rrFw_1 var1) {
      if (var1.id_class() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_private[17]]) {
         this.id_while();
      }
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[id_private[39]]).id_class()) {
         rdn_3 var2 = var1.id_class();
         if (rrjQ_2.id_class(var2)) {
            var1.id_class(id_implements[18]);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1320744056;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[21]]) {
         if (((rrIk_1)this.id_break[id_private[22]]).id_class() && (Boolean)this.id_break[id_private[23]]) {
            if (!((rhx_3)((cb_3)id_import.id_class[id_private[24]]).id_implements[id_private[25]]).id_break) {
               Integer var8 = (Integer)this.id_break[id_private[26]] + id_implements[16];
               this.id_break[id_private[27]] = var8;
            }

            if ((Integer)this.id_break[id_private[28]] > id_catch[5]) {
               ((cb_3)id_import.id_class[id_private[29]]).G();
               this.id_new();
            }
         }

         for (rrHa_1 var3 : (List)this.id_break[id_private[30]]) {
            if (System.currentTimeMillis() - ((Ax_1)id_import.id_class[id_private[31]]).id_byte > id_protected[0]
               && ((cb_3)id_import.id_class[id_private[32]]).id_protected(var3.id_class())) {
               ((List)this.id_break[id_private[33]]).remove(var3);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_super();
      ((List)this.id_break[id_private[40]]).clear();
   }

   @EventTarget
   public void id_class(rrAt_1 var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[id_private[18]]).id_class() && var1.id_class() == (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[id_private[19]]) {
         var1.id_class(id_implements[14]);
         Boolean var6 = id_implements[15];
         this.id_break[id_private[20]] = var6;
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rvp_3 var2
         && ((rrIk_1)this.id_break[id_private[34]]).id_class()
         && (rrfq_3)rrfp_3.id_class[id_private[35]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_private[36]]) {
         String var4 = var2.id_protected().id_byte();
         if (var4.equals(id_throws[10]) || var4.equals(id_throws[11])) {
            var1.id_class(id_implements[17]);
            ((Aq_1)((cb_3)id_import.id_class[id_private[37]]).id_break[id_private[38]]).id_break(new rmj_3(var2.id_break()));
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1916942720712137223L;
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[id_private[14]]).id_class() && ((rhx_3)((cb_3)id_import.id_class[id_private[15]]).id_implements[id_private[16]]).id_break) {
         float var2 = rrfj_3.id_class();
         boolean var3 = rrfj_3.id_catch();
         boolean var4 = var2 != id_byte[0] ? id_implements[12] : id_implements[13];
         float var5 = var3 && var4 ? id_byte[1] : id_byte[2];
         float var6 = var3 ? id_byte[3] : id_byte[4];
         var1.id_class(var5);
         var1.id_catch().id_byte = (double)(var2 * var6);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -128, 108, -35, -123, 66, -86, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   private static void id_goto() {
      id_catch = new byte[]{2, 3, 2, 3, 2, 10, 9, 7, 8};
   }

   private static void id_continue() {
      id_throws = new String[]{
         new String("RW Helper"),
         new String("Утилитарный модуль для\nReallyWorld"),
         new String("Флай на драгоне"),
         new String("Закрытие меню"),
         new String("Не ставить шары"),
         new String("Авто. полёт"),
         new String("Авто. починка"),
         new String("Авто. исцеление"),
         new String("Утилиты"),
         new String("После ПВП"),
         new String("ꈁꀀꈂꌁꈂꀁꈃꄀ"),
         new String("Меню"),
         new String("/fly"),
         new String("/fix all"),
         new String("/heal")
      };
   }

   private static void id_else() {
      id_implements = new boolean[]{
         true, true, true, true, true, true, false, false, true, true, false, true, true, false, true, true, true, true, true, false, false, false, false
      };
   }

   private void id_new() {
      this.id_super();
      Boolean var5 = id_implements[19];
      this.id_break[id_private[48]] = var5;
      Integer var6 = Integer.valueOf(id_implements[20]);
      this.id_break[id_private[49]] = var6;
   }

   private static void id_return() {
      id_protected = new long[]{1000L};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         this.id_break[7] = false;
         this.id_break[8] = 0;
      }
   }

   private void id_while() {
      this.id_super();
      ((List)this.id_break[id_private[41]]).clear();
      if (((rrIk_1)this.id_break[id_private[42]]).id_class()) {
         ((List)this.id_break[id_private[43]]).add(new rrHa_1(id_throws[12]));
      }

      if (((rrIk_1)this.id_break[id_private[44]]).id_class()) {
         ((List)this.id_break[id_private[45]]).add(new rrHa_1(id_throws[13]));
      }

      if (((rrIk_1)this.id_break[id_private[46]]).id_class()) {
         ((List)this.id_break[id_private[47]]).add(new rrHa_1(id_throws[14]));
      }
   }

   private static void id_public() {
      id_private = new short[]{
         4,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         1,
         2,
         5,
         4,
         3,
         0,
         57,
         18,
         1,
         0,
         1,
         7,
         0,
         0,
         7,
         57,
         18,
         8,
         8,
         8,
         57,
         6,
         55,
         57,
         6,
         1,
         1,
         0,
         57,
         0,
         2,
         6,
         6,
         3,
         6,
         4,
         6,
         5,
         6,
         7,
         8
      };
   }
}
