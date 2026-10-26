package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoSwap extends Module {
   private static String[] id_protected;
   public Object[] id_break;
   private static byte[] id_throws;
   private static long[] id_catch;
   private static boolean[] id_private;
   private static short[] id_implements;
   public static Object[] id_byte;
   private static float[] id_finally;

   private rrCh_1 id_boolean() {
      this.B();
      if (this.id_instanceof()) {
         return (rrCh_1)this.id_break[4];
      } else if (this.id_new()) {
         return (rrCh_1)this.id_break[1];
      } else if (this.id_continue()) {
         return (rrCh_1)this.id_break[2];
      } else if (this.id_else()) {
         return (rrCh_1)this.id_break[3];
      } else if (this.id_this()) {
         return (rrCh_1)this.id_break[5];
      } else {
         return (rrCh_1)(this.id_throw() ? (rrCd_1)this.id_break[6] : (rrCh_1)this.id_break[4]);
      }
   }

   public boolean id_char() {
      this.B();
      return ((rrIQ)this.id_break[9]).id_byte().equals("Умный");
   }

   private static void id_byte(String var0) {
   }

   private boolean id_byte(rrCh_1 var1) {
      return ((cb_3)id_import.id_class[57]).sK().id_class(var1.id_class());
   }

   private static void id_long() {
      id_private = new boolean[]{
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   public AutoSwap() {
      super("Auto Swap", "Автоматически меняет предмет\nв правой руке", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.B();
      rrmi_3 var5 = new rrmi_3();
      this.id_break[0] = var5;
      rrCM var6 = new rrCM();
      this.id_break[1] = var6;
      rrCb_1 var7 = new rrCb_1();
      this.id_break[2] = var7;
      rrCx_1 var8 = new rrCx_1();
      this.id_break[3] = var8;
      rrCJ var9 = new rrCJ();
      this.id_break[4] = var9;
      rrCX var10 = new rrCX();
      this.id_break[5] = var10;
      rrCd_1 var11 = new rrCd_1();
      this.id_break[6] = var11;
      rrIQ var12 = new rrIQ("Режим", "Умный", "Умный", "Бинд").id_class("change_mode", (var1, var2) -> this.id_strictfp());
      this.id_break[9] = var12;
      rrIQ var13 = new rrIQ("Менять с", "Щит", "Щит", "Гепл", "Шар", "Руна", "Сфера", "Тотем").id_class("change_mode", (var1, var2) -> this.id_strictfp());
      this.id_break[10] = var13;
      rrIQ var14 = new rrIQ("Менять на", "Гепл", "Гепл", "Щит", "Шар", "Руна", "Сфера", "Тотем").id_class("change_mode", (var1, var2) -> this.id_strictfp());
      this.id_break[11] = var14;
      rrIF var15 = new rrIF("Клавиша свапа", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[3]).id_class(() -> this.id_try());
      this.id_break[12] = var15;
      rrIm_1 var16 = new rrIm_1("Здоровье", 16.5F, 1.0F, 19.5F, 0.5F).id_class(() -> this.id_char());
      this.id_break[13] = var16;
      rrIk_1 var17 = new rrIk_1("Проверять кристалл", true).id_class(() -> this.id_char() && this.id_continue() ? true : id_private[46]);
      this.id_break[14] = var17;
      this.id_class(
         new Setting[]{
            (rrIQ)this.id_break[9],
            (rrIQ)this.id_break[10],
            (rrIQ)this.id_break[11],
            (rrIF)this.id_break[12],
            (rrIm_1)this.id_break[13],
            (rrIk_1)this.id_break[14]
         }
      );
   }

   static {
      ntfClinit();
   }

   private void B() {
      if (this.id_break == null) {
         this.id_break = new Object[15];
         this.id_break[7] = 0L;
         this.id_break[8] = 0;
      }
   }

   public boolean id_this() {
      this.B();
      return ((rrIQ)this.id_break[10]).id_byte().equals("Руна");
   }

   public boolean id_interface() {
      this.B();
      return ((rrIQ)this.id_break[11]).id_byte().equals("Шар");
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1553158444;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4924245967987713692L;
   }

   @EventTarget
   public void id_class(rrLa_1 var1) {
      if (this.id_char()) {
         rdn_3 var2 = var1.id_class();
         rrLi_1 var3 = var1.id_break();
         if (this.P()) {
            int var4 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
            rdn_3 var5 = ((cb_3)id_import.id_class[57]).Sn();
            rrCh_1 var6 = this.id_switch();
            rrCh_1 var7 = this.id_boolean();
            Pair var8 = this.id_class(var6);
            Pair var9 = this.id_class(var7);
            Predicate var10 = var6.id_break(this);
            Predicate var11 = var7.id_break(this);
            if (this.id_class(var2, var3)) {
               this.id_class(var8, var10, var9, var5, var4);
            } else if (this.id_class(var10, var2, var3) && this.id_static()) {
               this.id_class(var7, var9, var11, var5, var4, false);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_strictfp();
   }

   private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2, rrLi_1 var3) {
      if (var3 instanceof rrAP && this.id_instanceof() && var2.id_break() == rdy_3.kN) {
         return true;
      } else {
         return var3 instanceof rrAr_1 && var1.test(var2) ? true : id_private[35];
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.B();
      if (var1.id_break() == ((rrIF)this.id_break[12]).id_finally().id_byte() && this.id_try()) {
         int var2 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
         rrCh_1 var4 = this.id_switch();
         rrCh_1 var5 = this.id_boolean();
         Pair var6 = this.id_class(var4);
         Pair var7 = this.id_class(var5);
         if (!this.P()) {
            return;
         }

         Predicate var8 = var4.id_break(this);
         Predicate var9 = var5.id_break(this);
         if (this.id_class(var8, var3)) {
            this.id_class(var5, var7, var9, var3, var2, true);
         } else {
            this.id_class(var6, var8, var7, var3, var2);
         }
      }
   }

   private boolean id_class(rdn_3 var1, rrLi_1 var2) {
      if (!(var2 instanceof rrAr_1)) {
         return id_private[32];
      } else {
         return this.id_instanceof() && var1.id_break() == rdy_3.kN ? true : id_private[31];
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.B();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && this.id_char()) {
         int var2 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
         rrCh_1 var4 = this.id_switch();
         rrCh_1 var5 = this.id_boolean();
         Predicate var6 = var4.id_break(this);
         Predicate var7 = var5.id_break(this);
         if (this.id_break(var7, var3)) {
            Integer var14 = (Integer)this.id_break[8] + 1;
            this.id_break[8] = var14;
         } else {
            Integer var15 = 0;
            this.id_break[8] = var15;
         }

         if (((cb_3)id_import.id_class[57]).P() == rpm_3.OFF_HAND && this.id_class(var6, ((cb_3)id_import.id_class[57]).sX())) {
            Long var16 = System.currentTimeMillis();
            this.id_break[7] = var16;
         }

         if (!this.P()) {
            return;
         }

         Pair var8 = this.id_class(var4);
         Pair var9 = this.id_class(var5);
         if (this.id_break(var4)) {
            this.id_class(var8, var6, var9, var3, var2);
         } else if (this.id_static()) {
            this.id_class(var5, var9, var7, var3, var2, false);
         }
      }
   }

   private Pair<rdn_3, Integer> id_class(rrCh_1 var1) {
      Predicate var2 = var1.id_break(this);
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < 36; var4++) {
         rdn_3 var5 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var4);
         if (!var5.id_class() && var2.test(var5)) {
            var3.add(Pair.of(var5, var4));
         }
      }

      Comparator var6 = var1.id_byte(this);
      if (var6 != null) {
         var3.sort(var6);
      }

      return var3.isEmpty() ? null : (Pair)var3.get(0);
   }

   private void id_class(Pair<rdn_3, Integer> var1, Predicate<rdn_3> var2, Pair<rdn_3, Integer> var3, rdn_3 var4, int var5) {
      this.B();
      if (var1 != null) {
         if (!this.id_class(var2, var4)) {
            int var6 = (Integer)var1.getRight();
            if (var6 != -1) {
               int var7 = rrfY_2.id_break(var6);
               if (var3 != null) {
                  rdn_3 var8 = (rdn_3)var3.getLeft();
                  ((rrmi_3)this.id_break[0]).id_class(var8, var7);
                  id_byte("saved swap back item " + var7);
               }

               this.id_class(var5, var7, 40);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
               rVi_1 var9 = rrfu_3.id_class()
                  .id_class("Свапнул ")
                  .id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_))
                  .id_break()
                  .id_class(((cb_3)id_import.id_class[57]).Sn().id_continue());
               ((cq_3)id_import.id_class[19]).id_class(var9, false, true);
            }
         }
      }
   }

   private boolean id_class(rdb_3 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < 36; var3++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3).id_break() == var1) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private int id_class(Pair<rdn_3, Integer> var1) {
      this.B();
      if (this.id_try()) {
         return var1 != null ? (Integer)var1.getValue() : id_throws[21];
      } else {
         return ((rrmi_3)this.id_break[0]).id_class(true);
      }
   }

   private void id_class(int var1, int var2, int var3) {
      ((Ax_1)id_import.id_class[55]).id_class(var1, var2, var3, rXa_1.SWAP, false);
   }

   private void id_class(rrCh_1 var1, Pair<rdn_3, Integer> var2, Predicate<rdn_3> var3, rdn_3 var4, int var5, boolean var6) {
      this.B();
      int var7 = this.id_class(var2);
      if (var7 >= 0) {
         int var8 = rrfY_2.id_break(var7);
         if (this.id_break(var3, var4) && (!var1.id_class(this) || !this.id_class(var4.id_break()))) {
            if (!var6 && (Integer)this.id_break[8] > 5) {
               ((rrmi_3)this.id_break[0]).id_throws();
               id_byte("reset swap back item");
            }
         } else {
            this.id_class(var5, var8, 40);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
            rVi_1 var9 = rrfu_3.id_class()
               .id_class("Свапнул ")
               .id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_))
               .id_break()
               .id_class(((cb_3)id_import.id_class[57]).Sn().id_continue());
            ((cq_3)id_import.id_class[19]).id_class(var9, false, true);
         }

         if (var6) {
            ((rrmi_3)this.id_break[0]).id_throws();
            id_byte("reset swap back item");
         }
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_strictfp();
   }

   private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   private static void id_short() {
      id_finally = new float[]{16.5F, 1.0F, 19.5F, 0.5F, 6.0F};
   }

   private static void id_void() {
      Object[] var0 = new Object[]{40, -1, false};
      id_byte = var0;
   }

   private static void r() {
      id_throws = new byte[]{2, 6, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 2, 3, 4, 5, -1, 40, 40, 5, 36, -1, 36, 15, 7, 8, 3, 40, -1, 2};
   }

   private boolean id_break(rrCh_1 var1) {
      if (this.id_byte(var1)) {
         return false;
      } else {
         return this.id_const() ? false : this.id_abstract();
      }
   }

   private boolean id_break(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, -25, -84, -87, 105, -3, -76, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_strictfp();
   }

   private boolean P() {
      if (((cb_3)id_import.id_class[57]).id_native()) {
         return false;
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_this().id_new().id_break() ? false : id_private[24];
      }
   }

   public boolean id_goto() {
      this.B();
      return ((rrIQ)this.id_break[11]).id_byte().equals("Сфера");
   }

   private boolean id_const() {
      this.B();
      return ((rrIk_1)this.id_break[14]).id_class() && this.id_continue()
         ? ((gm_3)id_import.id_class[56])
            .id_return()
            .int2ObjectEntrySet()
            .stream()
            .filter(var0 -> var0.getValue() instanceof rSa_1)
            .anyMatch(var0 -> ((an_3)var0.getValue()).id_implements((cb_3)id_import.id_class[57]) <= 6.0F ? true : id_private[44])
         : id_private[38];
   }

   public boolean id_continue() {
      this.B();
      return ((rrIQ)this.id_break[10]).id_byte().equals("Шар");
   }

   public boolean id_else() {
      this.B();
      return ((rrIQ)this.id_break[10]).id_byte().equals("Сфера");
   }

   private static void id_for() {
      id_catch = new long[]{400L, 0L};
   }

   private static void id_import() {
      id_implements = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         9,
         10,
         11,
         3,
         12,
         13,
         14,
         9,
         10,
         11,
         12,
         13,
         14,
         0,
         57,
         4,
         57,
         8,
         8,
         8,
         57,
         57,
         7,
         12,
         57,
         4,
         57,
         57,
         4,
         57,
         0,
         0,
         57,
         19,
         0,
         57,
         19,
         8,
         0,
         0,
         55,
         57,
         1,
         57,
         0,
         57,
         0,
         7,
         57,
         57,
         13,
         14,
         56,
         0,
         57,
         1,
         1,
         4,
         2,
         3,
         5,
         6,
         1,
         4,
         1,
         2,
         3,
         5,
         6,
         4,
         57,
         0,
         11,
         11,
         11,
         11,
         11,
         11,
         10,
         10,
         10,
         10,
         10,
         10,
         9,
         9,
         57
      };
   }

   public boolean id_instanceof() {
      this.B();
      return ((rrIQ)this.id_break[10]).id_byte().equals("Щит");
   }

   public boolean id_new() {
      this.B();
      return ((rrIQ)this.id_break[10]).id_byte().equals("Гепл");
   }

   public boolean id_return() {
      this.B();
      return ((rrIQ)this.id_break[11]).id_byte().equals("Гепл");
   }

   public boolean id_super() {
      this.B();
      return ((rrIQ)this.id_break[11]).id_byte().equals("Руна");
   }

   private rrCh_1 id_switch() {
      this.B();
      if (this.id_return()) {
         return (rrCh_1)this.id_break[1];
      } else if (this.id_while()) {
         return (rrCh_1)this.id_break[4];
      } else if (this.id_interface()) {
         return (rrCh_1)this.id_break[2];
      } else if (this.id_goto()) {
         return (rrCh_1)this.id_break[3];
      } else if (this.id_super()) {
         return (rrCh_1)this.id_break[5];
      } else {
         return (rrCh_1)(this.id_public() ? (rrCd_1)this.id_break[6] : (rrCh_1)this.id_break[1]);
      }
   }

   public boolean id_throw() {
      this.B();
      return ((rrIQ)this.id_break[10]).id_byte().equals("Тотем");
   }

   public boolean id_try() {
      this.B();
      return ((rrIQ)this.id_break[9]).id_byte().equals("Бинд");
   }

   public boolean id_while() {
      this.B();
      return ((rrIQ)this.id_break[11]).id_byte().equals("Щит");
   }

   private boolean id_static() {
      this.B();
      if (((cb_3)id_import.id_class[57]).sK().id_class(((rrmi_3)this.id_break[0]).id_protected())) {
         return false;
      } else {
         return System.currentTimeMillis() - this.id_break[7] < 400L ? false : id_private[29];
      }
   }

   public boolean id_public() {
      this.B();
      return ((rrIQ)this.id_break[11]).id_byte().equals("Тотем");
   }

   private boolean id_abstract() {
      this.B();
      float var1 = ((cb_3)id_import.id_class[57]).Ss() + ((cb_3)id_import.id_class[57]).Sd();
      return var1 <= ((rrIm_1)this.id_break[13]).id_byte() ? true : id_private[37];
   }

   private static void id_transient() {
      id_protected = new String[]{
         new String("Auto Swap"),
         new String("Автоматически меняет предмет\nв правой руке"),
         new String("Режим"),
         new String("Умный"),
         new String("Умный"),
         new String("Бинд"),
         new String("change_mode"),
         new String("Менять с"),
         new String("Щит"),
         new String("Щит"),
         new String("Гепл"),
         new String("Шар"),
         new String("Руна"),
         new String("Сфера"),
         new String("Тотем"),
         new String("change_mode"),
         new String("Менять на"),
         new String("Гепл"),
         new String("Гепл"),
         new String("Щит"),
         new String("Шар"),
         new String("Руна"),
         new String("Сфера"),
         new String("Тотем"),
         new String("change_mode"),
         new String("Клавиша свапа"),
         new String("Здоровье"),
         new String("Проверять кристалл"),
         new String("Свапнул "),
         new String("Свапнул "),
         new String("reset swap back item"),
         new String("reset swap back item"),
         new String("Гепл"),
         new String("Щит"),
         new String("Шар"),
         new String("Сфера"),
         new String("Руна"),
         new String("Тотем"),
         new String("Шар"),
         new String("Сфера"),
         new String("Руна"),
         new String("Щит"),
         new String("Гепл"),
         new String("Тотем"),
         new String("Бинд"),
         new String("Умный")
      };
   }

   private void id_strictfp() {
      this.B();
      ((rrmi_3)this.id_break[0]).id_throws();
   }
}
