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
      return ((rrIk_1)((Pair)id_byte[id_catch[71]]).getLeft()).id_class();
   }

   private float id_float() {
      this.id_char();
      return ((rrIm_1)this.id_break[id_catch[77]]).id_byte();
   }

   public AutoTotem() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_char();
      String var10003 = id_private[2];
      String var10004 = id_private[3];
      String[] var10005 = new String[id_implements[0]];
      var10005[id_throws[0]] = id_private[4];
      var10005[id_throws[1]] = id_private[5];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005).id_class(id_private[6], (var1, var2) -> {
         this.id_char();
         if ((rrCk_1)this.id_break[id_catch[78]] != null && this.aJ_()) {
            ((rrCk_1)this.id_break[id_catch[79]]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = id_implements[20];
         switch (var3.hashCode()) {
            case -654193598:
               if (var3.equals(id_private[15])) {
                  var4 = id_throws[38];
               }
               break;
            case 1155506348:
               if (var3.equals(id_private[14])) {
                  var4 = id_throws[37];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCz_1)this.id_break[id_catch[80]];
            case 1 -> (rrCW)this.id_break[id_catch[81]];
            default -> null;
         };
         this.id_break[id_catch[82]] = var9x;
         if ((rrCk_1)this.id_break[id_catch[83]] != null && this.aJ_()) {
            ((rrCk_1)this.id_break[id_catch[84]]).aI_();
         }
      });
      this.id_break[id_catch[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_private[7], id_throws[2]);
      this.id_break[id_catch[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_private[8], id_throws[3]);
      this.id_break[id_catch[3]] = var7;
      rrIm_1 var8 = new rrIm_1(id_private[9], id_protected[0], id_protected[1], id_protected[2], id_protected[3]);
      this.id_break[id_catch[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_private[10], id_throws[4]);
      this.id_break[id_catch[5]] = var9;
      rrCz_1 var10 = new rrCz_1(this);
      this.id_break[id_catch[6]] = var10;
      rrCW var11 = new rrCW(this);
      this.id_break[id_catch[7]] = var11;
      Setting[] var10001 = new Setting[id_implements[1]];
      byte var13 = id_throws[5];
      String var10006 = id_private[11];
      rrIk_1[] var10007 = new rrIk_1[id_implements[2]];
      var10007[id_throws[6]] = (rrIk_1)((Pair)id_byte[id_catch[8]]).getLeft();
      var10007[id_throws[7]] = (rrIk_1)((Pair)id_byte[id_catch[9]]).getLeft();
      var10007[id_implements[3]] = (rrIk_1)((Pair)id_byte[id_catch[10]]).getLeft();
      var10007[id_implements[4]] = (rrIk_1)((Pair)id_byte[id_catch[11]]).getLeft();
      var10007[id_implements[5]] = (rrIk_1)((Pair)id_byte[id_catch[12]]).getLeft();
      var10001[var13] = new rrIc_1(var10006, var10007);
      var10001[id_throws[8]] = (rrIQ)this.id_break[id_catch[13]];
      var10001[id_implements[6]] = (Setting)((Pair)id_byte[id_catch[14]]).getRight();
      var10001[id_implements[7]] = (Setting)((Pair)id_byte[id_catch[15]]).getRight();
      var10001[id_implements[8]] = (Setting)((Pair)id_byte[id_catch[16]]).getRight();
      var10001[id_implements[9]] = (Setting)((Pair)id_byte[id_catch[17]]).getRight();
      var10001[id_implements[10]] = (Setting)((Pair)id_byte[id_catch[18]]).getRight();
      var10001[id_implements[11]] = (rrIm_1)this.id_break[id_catch[19]];
      var10001[id_implements[12]] = (rrIk_1)this.id_break[id_catch[20]];
      var10001[id_implements[13]] = (rrIk_1)this.id_break[id_catch[21]];
      var10001[id_implements[14]] = (rrIk_1)this.id_break[id_catch[22]];
      this.id_class(var10001);
      rrCz_1 var12 = (rrCz_1)this.id_break[id_catch[23]];
      this.id_break[id_catch[24]] = var12;
   }

   static {
      ntfClinit();
   }

   public Pair<rdn_3, Integer> id_this() {
      if (((cb_3)id_import.id_class[id_catch[47]]).sK().id_class(rdy_3.kL)) {
         return Pair.of(null, Integer.valueOf(id_implements[17]));
      } else {
         for (int var1 = id_throws[14]; var1 < id_implements[18]; var1++) {
            rdn_3 var2 = ((rhz_3)((cb_3)id_import.id_class[id_catch[48]]).id_implements[id_catch[49]]).id_extends(var1);
            if (var2.id_break() == rdy_3.kL && !this.id_class(var2)) {
               return Pair.of(var2, var1);
            }
         }

         return Pair.of(null, Integer.valueOf(id_implements[19]));
      }
   }

   private static void id_interface() {
      Object[] var0 = new Object[]{
         rrwg_3.id_class(new rrIk_1(id_private[16], true), new rrIm_1(id_private[17], 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1(id_private[18], false), new rrIm_1(id_private[19], 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1(id_private[20], false), new rrIm_1(id_private[21], 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1(id_private[22], false), new rrIm_1(id_private[23], 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.id_class(new rrIk_1(id_private[24], false), new rrIm_1(id_private[25], 0.0F, 0.0F, 0.0F, 0.0F)),
         new rdn_3(rdy_3.kL)
      };
      id_byte = var0;
   }

   public void id_class(float var1) {
      this.id_char();
      if (this.aJ_() && ((rrIk_1)this.id_break[id_catch[32]]).id_class()) {
         if ((cb_3)id_import.id_class[id_catch[33]] == null || (gm_3)id_import.id_class[id_catch[34]] == null) {
            return;
         }

         if (((cb_3)id_import.id_class[id_catch[35]]).id_implements()
            || ((cb_3)id_import.id_class[id_catch[36]]).id_native()
            || ((cb_3)id_import.id_class[id_catch[37]]).rg()
            || !((Ax_1)id_import.id_class[id_catch[38]]).id_class()) {
            return;
         }

         byte var2 = ((cb_3)id_import.id_class[id_catch[39]]).id_implements[id_catch[40]] >= id_throws[9] && !((cb_3)id_import.id_class[id_catch[41]]).L()
            ? id_implements[16]
            : id_implements[15];
         ((cq_3)id_import.id_class[id_catch[42]])
            .id_class(
               id_const.id_package() - id_protected[4],
               (float)(id_const.id_this() - var2),
               var1,
               (cb_3)id_import.id_class[id_catch[43]],
               (rdn_3)id_byte[id_catch[44]],
               id_throws[10]
            );
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_char();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[25]]) {
         Integer var6 = rrfY_2.id_class(rdy_3.kL, var0 -> !var0.id_protected(id_private[13]) ? id_throws[35] : id_throws[36]);
         this.id_break[id_catch[26]] = var6;
      }
   }

   private boolean id_class(rdn_3 var1) {
      this.id_char();
      if (!((rrIk_1)this.id_break[id_catch[50]]).id_class()) {
         return id_throws[17];
      } else {
         return var1.id_protected(id_private[12]) && this.id_break[id_catch[51]] > 0 ? id_throws[15] : id_throws[16];
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
      if ((cb_3)id_import.id_class[id_catch[27]] != null && (gm_3)id_import.id_class[id_catch[28]] != null) {
         if (!((cb_3)id_import.id_class[id_catch[29]]).id_implements() && !((cb_3)id_import.id_class[id_catch[30]]).rg()) {
            if (!this.id_for()) {
               if (var1.id_class() instanceof rSa_1 var3 && ((cb_3)id_import.id_class[id_catch[31]]).id_implements(var3) <= this.id_default()) {
                  this.id_new().id_byte();
               }
            }
         }
      }
   }

   private float id_default() {
      return ((rrIm_1)((Pair)id_byte[id_catch[72]]).getRight()).id_byte();
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
         ? id_throws[29]
         : rrjc_3.id_class(
               var0 -> rrjc_3.id_protected(var0) instanceof Wv_1,
               (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_catch[61]],
               this.id_instanceof()
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

      Integer var6 = Integer.valueOf(id_throws[34]);
      this.id_break[id_catch[66]] = var6;
   }

   private boolean id_goto() {
      return ((rrIk_1)((Pair)id_byte[id_catch[67]]).getLeft()).id_class();
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
      rpm_3[] var1 = rpm_3.values();
      int var2 = var1.length;

      for (int var3 = id_throws[11]; var3 < var2; var3++) {
         rpm_3 var4 = var1[var3];
         rdn_3 var5 = ((cb_3)id_import.id_class[id_catch[46]]).id_protected(var4);
         if (!this.id_class(var5) && var5.id_break() == rdy_3.kL) {
            return id_throws[12];
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
      return !((rrIk_1)this.id_break[id_catch[64]]).id_class() ? id_throws[33] : rrjQ_2.id_class(((cb_3)id_import.id_class[id_catch[65]]).Sn());
   }

   private float id_import() {
      return ((rrIm_1)((Pair)id_byte[id_catch[75]]).getRight()).id_byte();
   }

   private float id_instanceof() {
      return ((rrIm_1)((Pair)id_byte[id_catch[74]]).getRight()).id_byte();
   }

   public rrCk_1 id_new() {
      this.id_char();
      return (rrCk_1)this.id_break[id_catch[45]];
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
      if (!((cb_3)id_import.id_class[id_catch[52]]).id_implements()
         && !((cb_3)id_import.id_class[id_catch[53]]).rg()
         && ((cb_3)id_import.id_class[id_catch[54]]).BM()) {
         if (((cb_3)id_import.id_class[id_catch[55]]).Ss() + ((cb_3)id_import.id_class[id_catch[56]]).Sd() <= this.id_float()) {
            return id_throws[19];
         } else {
            if (!this.id_for()) {
               if (this.id_public()) {
                  return id_throws[20];
               }

               if (this.id_static()) {
                  return id_throws[21];
               }

               if (this.id_void()) {
                  return id_throws[22];
               }

               if (this.id_while()) {
                  return id_throws[23];
               }
            }

            return id_throws[24];
         }
      } else {
         return id_throws[18];
      }
   }

   private boolean id_throw() {
      return ((rrIk_1)((Pair)id_byte[id_catch[69]]).getLeft()).id_class();
   }

   private float id_try() {
      return ((rrIm_1)((Pair)id_byte[id_catch[73]]).getRight()).id_byte();
   }

   private boolean id_while() {
      if (!this.id_long()) {
         return id_throws[30];
      } else {
         return ((cb_3)id_import.id_class[id_catch[62]]).id_throws[id_catch[63]] >= this.id_transient() ? id_throws[31] : id_throws[32];
      }
   }

   private boolean id_static() {
      return !this.id_strictfp()
         ? id_throws[28]
         : rrjc_3.id_class(rrjc_3::id_byte, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_catch[60]], this.id_try()).findAny().isPresent();
   }

   private boolean id_public() {
      ObjectIterator var1 = ((gm_3)id_import.id_class[id_catch[57]]).id_return().int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         an_3 var3 = (an_3)var2.getValue();
         if (var3 instanceof rSa_1 && this.id_goto()) {
            if (((cb_3)id_import.id_class[id_catch[58]]).id_implements(var3) <= this.id_default()) {
               return id_throws[25];
            }
         } else if (var3 instanceof rsX_2 && this.id_abstract() && ((cb_3)id_import.id_class[id_catch[59]]).id_implements(var3) <= this.id_import()) {
            return id_throws[26];
         }
      }

      return id_throws[27];
   }

   private boolean id_abstract() {
      return ((rrIk_1)((Pair)id_byte[id_catch[70]]).getLeft()).id_class();
   }

   private float id_transient() {
      return ((rrIm_1)((Pair)id_byte[id_catch[76]]).getRight()).id_byte();
   }

   private boolean id_strictfp() {
      return ((rrIk_1)((Pair)id_byte[id_catch[68]]).getLeft()).id_class();
   }
}
