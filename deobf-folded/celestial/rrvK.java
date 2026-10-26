package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvK extends rrFl_1<rrvU> {
   private static boolean[] id_break;
   private static int[] id_protected;
   private static String[] id_throws;
   private static byte[] id_case;
   public Object[] id_class;
   private static short[] id_catch;
   private static float[] id_private;

   static String id_byte(String var0) {
      return var0.replace(id_throws[2], id_throws[3]).replaceAll(id_throws[4], id_throws[5]).trim();
   }

   @Override
   public Collection<rrvU> id_byte() {
      this.id_implements();
      return (List)this.id_class[1];
   }

   public rrvK(rrvo_1 var1) {
      this.id_implements();
      ArrayList var6 = new ArrayList();
      this.id_class[1] = var6;
      ArrayList var7 = new ArrayList();
      this.id_class[2] = var7;
      this.id_class[id_catch[2]] = var1;
      ((List)this.id_class[1]).add(new rrve_1(this, id_throws[0], id_throws[1]));
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3) {
      this.id_implements();
      float var4 = ((rrvo_1)this.id_class[id_catch[4]]).id_long();
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[5]]).id_class();
      this.id_break(18.0F);
      float var6 = this.id_finally();
      float var7 = this.id_protected();
      var5.id_class(MinecraftAccessor.id_strictfp);

      for (rrvU var9 : this.id_byte()) {
         AnimValue var10 = var9.id_break();
         var9.id_class(var9.id_catch());
         if (var10.id_case()) {
            float var11 = var10.id_byte();
            float var12 = var10.id_continue();
            float var13 = var7 * 0.8F * var12;
            float var14 = var2 + 3.0F;
            float var15 = var3 + var6 - var13;
            int var16 = ColorHelper.id_break(rrZF.d_, (int)(255.0F * var11 * var4));
            String var17 = var9.id_case();
            String var18 = var9.id_class();
            var5.id_break(var1, MinecraftAccessor.id_strictfp, var17, (double)var14, (double)var15, var16, id_break[0], id_break[1]);
            var5.id_break(
               var1,
               MinecraftAccessor.id_strictfp,
               var18,
               (double)(var14 + ((rrvo_1)this.id_class[id_catch[6]]).id_implements() - var5.id_break(var18) - 5.0F),
               (double)var15,
               var16,
               id_break[2],
               id_break[3]
            );
            float var19 = var7 * var11;
            var6 += var19;
            this.id_class(var19);
         }
      }

      var5.id_byte(MinecraftAccessor.id_strictfp);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -623258179;
   }

   public void id_class(rrLa_1 var1) {
      this.id_implements();
      rdn_3 var2 = var1.id_class();
      if (var1.id_break() instanceof rrAr_1 var3) {
         synchronized ((List)this.id_class[1]) {
            if (this.id_class(var2, var3.id_break())) {
               return;
            }

            var2 = id_class(var2);
            rrvD var5 = new rrvD(var2);
            if (!((List)this.id_class[1]).contains(var5)) {
               ((List)this.id_class[1]).add(var5);
               if (((List)this.id_class[1]).size() > 1) {
                  ((List)this.id_class[1]).sort(Comparator.comparingInt(var0 -> var0 instanceof rrvD var1x ? -var1x.id_implements() : id_break[15]));
               }
            }
         }
      }
   }

   private boolean id_class(rdn_3 var1, int var2) {
      rdb_3 var3 = var1.id_break();
      if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         if (var3 == rdy_3.dc && var2 >= 72000) {
            return true;
         }

         if (var3 == rdy_3.hR && var2 >= 72000) {
            return true;
         }

         if (var3 == rdy_3.WL && var2 >= 6000) {
            return true;
         }

         if (var3 == rdy_3.Ex && var2 >= 6000) {
            return true;
         }
      }

      return id_break[11];
   }

   public List<rrvU> id_class() {
      this.id_implements();
      return (List<rrvU>)this.id_class[2];
   }

   public float id_class(rrvU var1) {
      String var2 = var1.id_case() + var1.id_class();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[22]]).id_class().id_break(var2) + 15.0F;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 115, -79, 31, 60, 54, 127, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static rdn_3 id_class(rdn_3 var0) {
      if (!var0.id_class() && (cb_3)MinecraftAccessor.id_import.id_class[57] != null) {
         rdn_3 var1 = null;
         int var2 = -1;
         boolean var3 = id_break[12];

         for (rqs_3 var5 : ((rhz_3)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_implements[1]).id_extends()) {
            for (rdn_3 var7 : var5) {
               if (rdn_3.id_byte(var7, var0)) {
                  boolean var8 = var7.id_this();
                  int var9 = var7.id_abstract();
                  if (var1 == null || var8 && !var3 || var8 == var3 && var9 > var2) {
                     var1 = var7;
                     var3 = var8;
                     var2 = var9;
                  }
               }
            }
         }

         return var1 != null ? var1 : var0;
      } else {
         return var0;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8247475847129452823L;
   }

   public void id_break() {
      this.id_implements();
      ((List)this.id_class[1]).removeIf(var0 -> !var0.id_byte() ? true : id_break[14]);
   }

   @Override
   public void id_throws() {
      this.id_implements();
      super.id_throws();
      Collection var1 = this.id_byte();
      Boolean var11 = id_break[4];
      this.id_class[3] = var11;
      ((List)this.id_class[2]).clear();
      if (!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while (var2.hasNext()) {
            rrvU var3 = (rrvU)var2.next();
            AnimValue var4 = var3.id_break();
            boolean var5 = var3.id_byte();
            if (!var5) {
               if (var4.id_catch()) {
                  var2.remove();
                  continue;
               }

               if (var3 instanceof rrvD var6) {
                  var6.id_throws();
               }
            }

            if (var4.id_finally()) {
               if (var3.id_catch()) {
                  ((List)this.id_class[2]).add(var3);
               }

               if (!var5) {
                  Boolean var12 = true;
                  this.id_class[3] = var12;
               }
            }
         }
      }
   }

   private static void id_catch() {
      id_catch = new short[]{1, 2, 0, 1, 0, 0, 0, 1, 3, 2, 2, 3, 1, 1, 1, 1, 1, 1, 4, 6000, 6000, 1, 0, 57, 57, 1, 2, 3};
   }

   private static void id_extends() {
      id_case = new byte[]{-1, 4, 3};
   }

   public boolean id_case() {
      this.id_implements();
      return (Boolean)this.id_class[3];
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[3] = id_break[16];
      }
   }

   @Override
   public float id_protected() {
      return 10.0F;
   }

   private static void id_private() {
      id_protected = new int[]{72000, 72000};
   }

   private static void id_final() {
      id_break = new boolean[]{false, false, false, false, false, true, true, true, true, true, true, false, false, true, false, false, false};
   }

   private static void id_volatile() {
      id_private = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 5.0F, 15.0F, 10.0F};
   }

   private static void id_native() {
      id_throws = new String[]{
         new String("Preview Cooldown"), new String("**:**"), new String("ё"), new String("е"), new String("[^a-zA-Zа-яА-Я- ]+"), new String("")
      };
   }
}
