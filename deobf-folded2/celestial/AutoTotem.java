package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoTotem extends Module {
   public Object[] id_break;
   private static float[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_byte;
   private static short[] id_catch;
   private static String[] id_private;
   private static byte[] id_implements;

   private static void id_boolean() {
      id_implements = new byte[]{2, 11, 5, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 9, 10, 47, 54, -1, 45, -1, -1, 2, 3, 4, 5, 9, 8, 6};
   }

   private void id_char() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         this.id_break[8] = 0;
      }
   }

   private boolean id_long() {
      return ((rrIk_1)((Pair)id_byte[4]).getLeft()).id_class();
   }

   private float id_float() {
      this.id_char();
      return ((rrIm_1)this.id_break[4]).id_byte();
   }

   public AutoTotem() {
      super("Auto Totem", "Автоматически берет тотем в руку", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_char();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Advanced").id_class("change_mode", (var1, var2) -> {
         this.id_char();
         if ((rrCk_1)this.id_break[0] != null && this.aJ_()) {
            ((rrCk_1)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Funtime" -> (rrCz_1)this.id_break[6];
            case "Advanced" -> (rrCW)this.id_break[7];
            default -> null;
         };
         this.id_break[0] = var9x;
         if ((rrCk_1)this.id_break[0] != null && this.aJ_()) {
            ((rrCk_1)this.id_break[0]).aI_();
         }
      });
      this.id_break[1] = var5;
      rrIk_1 var6 = new rrIk_1("Сохранять зачарованные", true);
      this.id_break[2] = var6;
      rrIk_1 var7 = new rrIk_1("Не менять шар", true);
      this.id_break[3] = var7;
      rrIm_1 var8 = new rrIm_1("Здоровье", 5.0F, 1.0F, 20.0F, 0.5F);
      this.id_break[4] = var8;
      rrIk_1 var9 = new rrIk_1("Счетчик тотемов", true);
      this.id_break[5] = var9;
      rrCz_1 var10 = new rrCz_1(this);
      this.id_break[6] = var10;
      rrCW var11 = new rrCW(this);
      this.id_break[7] = var11;
      this.id_class(
         new Setting[]{
            new rrIc_1(
               "Срабатывать на",
               (rrIk_1)((Pair)id_byte[1]).getLeft(),
               (rrIk_1)((Pair)id_byte[0]).getLeft(),
               (rrIk_1)((Pair)id_byte[3]).getLeft(),
               (rrIk_1)((Pair)id_byte[4]).getLeft(),
               (rrIk_1)((Pair)id_byte[2]).getLeft()
            ),
            (rrIQ)this.id_break[1],
            (Setting)((Pair)id_byte[0]).getRight(),
            (Setting)((Pair)id_byte[1]).getRight(),
            (Setting)((Pair)id_byte[2]).getRight(),
            (Setting)((Pair)id_byte[3]).getRight(),
            (Setting)((Pair)id_byte[4]).getRight(),
            (rrIm_1)this.id_break[4],
            (rrIk_1)this.id_break[2],
            (rrIk_1)this.id_break[3],
            (rrIk_1)this.id_break[5]
         }
      );
      rrCz_1 var12 = (rrCz_1)this.id_break[6];
      this.id_break[0] = var12;
   }

   static {
      ntfClinit();
   }

   public Pair<rdn_3, Integer> id_this() {
      if (((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.kL)) {
         return Pair.of(null, -1);
      } else {
         for (int var1 = id_throws[14]; var1 < 45; var1++) {
            rdn_3 var2 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var1);
            if (var2.id_break() == rdy_3.kL && !this.id_class(var2)) {
               return Pair.of(var2, var1);
            }
         }

         return Pair.of(null, -1);
      }
   }

   private static void id_interface() {
      Object[] var0 = new Object[]{
         rrwg_3.id_class(new rrIk_1("Кристалл", true), new rrIm_1("Радиус до кристалла", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1("Обсидиан", false), new rrIm_1("Радиус до обсидиана", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1("Якорь", false), new rrIm_1("Радиус до якоря", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1("Динамит", false), new rrIm_1("Радиус до динамита", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1("Падение", false), new rrIm_1("Дальность падения", 0.0F, 0.0F, 0.0F, 0.0F)),
         new rdn_3(rdy_3.kL)
      };
      id_byte = var0;
   }

   public void id_class(float var1) {
      this.id_char();
      if (this.aJ_() && ((rrIk_1)this.id_break[5]).id_class()) {
         if ((cb_3)id_import.id_class[57] == null || (gm_3)id_import.id_class[56] == null) {
            return;
         }

         if (((cb_3)id_import.id_class[57]).id_implements()
            || ((cb_3)id_import.id_class[57]).id_native()
            || ((cb_3)id_import.id_class[57]).rg()
            || !((Ax_1)id_import.id_class[55]).id_class()) {
            return;
         }

         byte var2 = ((cb_3)id_import.id_class[57]).id_implements[19] >= 1 && !((cb_3)id_import.id_class[57]).L() ? id_implements[16] : id_implements[15];
         ((cq_3)id_import.id_class[19])
            .id_class(id_const.id_package() - 9.0F, (float)(id_const.id_this() - var2), var1, (cb_3)id_import.id_class[57], (rdn_3)id_byte[5], true);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_char();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Integer var6 = rrfY_2.id_class(rdy_3.kL, var0 -> !var0.id_protected("AttributeModifiers") ? true : id_throws[36]);
         this.id_break[8] = var6;
      }
   }

   private boolean id_class(rdn_3 var1) {
      this.id_char();
      if (!((rrIk_1)this.id_break[2]).id_class()) {
         return id_throws[17];
      } else {
         return var1.id_protected("AttributeModifiers") && this.id_break[8] > 0 ? true : id_throws[16];
      }
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 296806851;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -445587464335814465L;
   }

   @EventTarget
   public void id_class(rrnb_3 var1) {
      if ((cb_3)id_import.id_class[57] != null && (gm_3)id_import.id_class[56] != null) {
         if (!((cb_3)id_import.id_class[57]).id_implements() && !((cb_3)id_import.id_class[57]).rg()) {
            if (!this.id_for()) {
               if (var1.id_class() instanceof rSa_1 var3 && ((cb_3)id_import.id_class[57]).id_implements(var3) <= this.id_default()) {
                  this.id_new().id_byte();
               }
            }
         }
      }
   }

   private float id_default() {
      return ((rrIm_1)((Pair)id_byte[0]).getRight()).id_byte();
   }

   private static void id_short() {
      id_private = new String[]{
         new String("Auto Totem"),
         new String("Автоматически берет тотем в руку"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Advanced"),
         new String("change_mode"),
         new String("Сохранять зачарованные"),
         new String("Не менять шар"),
         new String("Здоровье"),
         new String("Счетчик тотемов"),
         new String("Срабатывать на"),
         new String("AttributeModifiers"),
         new String("AttributeModifiers"),
         new String("Funtime"),
         new String("Advanced"),
         new String("Кристалл"),
         new String("Радиус до кристалла"),
         new String("Обсидиан"),
         new String("Радиус до обсидиана"),
         new String("Якорь"),
         new String("Радиус до якоря"),
         new String("Динамит"),
         new String("Радиус до динамита"),
         new String("Падение"),
         new String("Дальность падения")
      };
   }

   private boolean id_void() {
      return !this.id_throw()
         ? false
         : rrjc_3.id_class(
               var0 -> rrjc_3.id_protected(var0) instanceof Wv_1, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2], this.id_instanceof()
            )
            .findAny()
            .isPresent();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -37, -41, 25, 107, 46, -76, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_char();
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }

      Integer var6 = 0;
      this.id_break[8] = var6;
   }

   private boolean id_goto() {
      return ((rrIk_1)((Pair)id_byte[0]).getLeft()).id_class();
   }

   private static void id_const() {
      id_catch = new short[]{
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         1,
         0,
         3,
         4,
         2,
         1,
         0,
         1,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         6,
         0,
         0,
         8,
         57,
         56,
         57,
         57,
         57,
         5,
         57,
         56,
         57,
         57,
         57,
         55,
         57,
         19,
         57,
         19,
         57,
         5,
         0,
         57,
         57,
         57,
         1,
         2,
         8,
         57,
         57,
         57,
         57,
         57,
         56,
         57,
         57,
         2,
         2,
         57,
         31,
         3,
         57,
         8,
         0,
         1,
         2,
         3,
         4,
         0,
         1,
         2,
         3,
         4,
         4,
         0,
         0,
         6,
         7,
         0,
         0,
         0
      };
   }

   public boolean id_continue() {
      for (rpm_3 var4 : rpm_3.values()) {
         rdn_3 var5 = ((cb_3)id_import.id_class[57]).id_protected(var4);
         if (!this.id_class(var5) && var5.id_break() == rdy_3.kL) {
            return true;
         }
      }

      return id_throws[13];
   }

   private static void id_else() {
      id_throws = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
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
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false
      };
   }

   private boolean id_for() {
      this.id_char();
      return !((rrIk_1)this.id_break[3]).id_class() ? false : rrjQ_2.id_class(((cb_3)id_import.id_class[57]).Sn());
   }

   private float id_import() {
      return ((rrIm_1)((Pair)id_byte[3]).getRight()).id_byte();
   }

   private float id_instanceof() {
      return ((rrIm_1)((Pair)id_byte[2]).getRight()).id_byte();
   }

   public rrCk_1 id_new() {
      this.id_char();
      return (rrCk_1)this.id_break[0];
   }

   private static void id_return() {
      id_protected = new float[]{
         5.0F,
         1.0F,
         20.0F,
         0.5F,
         9.0F,
         5.0F,
         3.0F,
         12.0F,
         1.0F,
         5.0F,
         3.0F,
         12.0F,
         1.0F,
         5.0F,
         3.0F,
         12.0F,
         1.0F,
         5.0F,
         3.0F,
         50.0F,
         1.0F,
         10.0F,
         5.0F,
         50.0F,
         1.0F
      };
   }

   public boolean id_super() {
      if (!((cb_3)id_import.id_class[57]).id_implements() && !((cb_3)id_import.id_class[57]).rg() && ((cb_3)id_import.id_class[57]).BM()) {
         if (((cb_3)id_import.id_class[57]).Ss() + ((cb_3)id_import.id_class[57]).Sd() <= this.id_float()) {
            return true;
         } else {
            if (!this.id_for()) {
               if (this.id_public()) {
                  return true;
               }

               if (this.id_static()) {
                  return true;
               }

               if (this.id_void()) {
                  return true;
               }

               if (this.id_while()) {
                  return true;
               }
            }

            return id_throws[24];
         }
      } else {
         return id_throws[18];
      }
   }

   private boolean id_throw() {
      return ((rrIk_1)((Pair)id_byte[2]).getLeft()).id_class();
   }

   private float id_try() {
      return ((rrIm_1)((Pair)id_byte[1]).getRight()).id_byte();
   }

   private boolean id_while() {
      if (!this.id_long()) {
         return false;
      } else {
         return ((cb_3)id_import.id_class[57]).id_throws[31] >= this.id_transient() ? true : id_throws[32];
      }
   }

   private boolean id_static() {
      return !this.id_strictfp()
         ? false
         : rrjc_3.id_class(rrjc_3::id_byte, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2], this.id_try()).findAny().isPresent();
   }

   private boolean id_public() {
      ObjectIterator var1 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         an_3 var3 = (an_3)var2.getValue();
         if (var3 instanceof rSa_1 && this.id_goto()) {
            if (((cb_3)id_import.id_class[57]).id_implements(var3) <= this.id_default()) {
               return true;
            }
         } else if (var3 instanceof rsX_2 && this.id_abstract() && ((cb_3)id_import.id_class[57]).id_implements(var3) <= this.id_import()) {
            return true;
         }
      }

      return id_throws[27];
   }

   private boolean id_abstract() {
      return ((rrIk_1)((Pair)id_byte[3]).getLeft()).id_class();
   }

   private float id_transient() {
      return ((rrIm_1)((Pair)id_byte[4]).getRight()).id_byte();
   }

   private boolean id_strictfp() {
      return ((rrIk_1)((Pair)id_byte[1]).getLeft()).id_class();
   }
}
