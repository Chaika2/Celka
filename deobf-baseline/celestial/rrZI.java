package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZI extends rrZN implements rrZT, rrZq_1<rrZi_1> {
   private static String[] id_protected;
   public static Object[] id_break;
   private static float[] id_throws;
   private static double[] id_case;
   private static short[] id_catch;
   private static byte[] id_private;
   private static boolean[] id_implements;
   public Object[] id_byte;

   @Override
   public List<rrZi_1> id_byte() {
      this.id_package();
      Predicate var1 = var1x -> {
         this.id_package();
         Module var2 = var1x.id_private();
         rrtY_2 var3 = ((rrvJ)this.id_byte[id_catch[22]]).id_finally().id_extends();
         String var4 = var3.id_final().trim().toLowerCase();
         boolean var5 = var3.id_new();
         if (var5) {
            return var2.id_int() == (Category)rrZt_1.id_byte[id_catch[23]] ? id_implements[10] : id_implements[11];
         } else {
            String var6 = var2.id_final().replaceAll(id_protected[0], id_protected[1]).toLowerCase();
            String var7 = var2.id_final().toLowerCase();
            String var8 = var2.ay_().toLowerCase();
            return !var6.contains(var4) && !var7.contains(var4) && !var8.contains(var4) ? id_implements[13] : id_implements[12];
         }
      };
      return ((List)this.id_byte[id_catch[17]]).stream().filter(var1).toList();
   }

   private static void id_int() {
      id_case = new double[]{25.0};
   }

   public rrZI(rrvJ var1, rrtu_3 var2, int var3, int var4) {
      this.id_package();
      ArrayList var13 = new ArrayList();
      this.id_byte[id_catch[0]] = var13;
      EnumMap var14 = new EnumMap<>(Category.class);
      this.id_byte[id_catch[1]] = var14;
      this.id_byte[id_catch[2]] = var1;
      Integer var16 = var3;
      this.id_byte[id_catch[3]] = var16;
      Supplier var5 = () -> (float)var1.id_volatile().id_abstract() + (float)var3;
      Supplier var6 = () -> (float)var1.id_volatile().id_finally() + (float)var4;

      for (Module var8 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[4]]).id_private().g()) {
         ((List)this.id_byte[id_catch[5]]).add(new rrZi_1(this, var2, var1.id_volatile(), var8, var5, var6, id_private[0], id_private[1]));
      }
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{1, 2, 0, 3, 0, 1, 253, 0, 253, 0, 1, 0, 3, 0, 363, 3, 2, 1, 2, 5, 0, 1, 0, 5, 255, 255};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3149884901384872226L;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_package();
      ClickGuiScreen var6 = ((rrvJ)this.id_byte[id_catch[7]]).id_volatile();
      int var7 = var6.id_abstract();
      int var8 = var6.id_finally();
      if (!this.id_class(var2, var3, (float)(var7 + id_private[2]), (float)(var8 + id_private[3] + id_private[4]), id_throws[11], id_throws[12])) {
         this.id_throws();
         return id_implements[1];
      } else if (!super.id_class(var1, var2, var3, var4, var5)) {
         return id_implements[2];
      } else {
         this.id_volatile().id_class(var1, var2, var3, var4, var5);
         List var9 = this.id_byte();

         for (int var10 = var9.size() - id_implements[3]; var10 >= 0; var10--) {
            rrZi_1 var11 = (rrZi_1)var9.get(var10);
            if (var11.id_class(var1, var2, var3, var4, var5)) {
               return id_implements[4];
            }
         }

         this.id_throws();
         return id_implements[5];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1423632777;
   }

   @Override
   public void id_class(Category var1, Category var2) {
      this.id_implements().id_class().id_extends();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_package();
      short var7 = id_catch[8];
      boolean var8 = this.id_class(
         (Integer)rrvk_1.id_class[id_catch[9]],
         (Integer)rrvk_1.id_class[id_catch[10]],
         (float)(((rrvJ)this.id_byte[id_catch[11]]).id_volatile().id_abstract() + (Integer)this.id_byte[id_catch[12]]),
         (float)(((rrvJ)this.id_byte[id_catch[13]]).id_volatile().id_finally() + id_private[5]),
         (float)(id_catch[14] - (Integer)this.id_byte[id_catch[15]] - id_private[6]),
         (float)var7
      );
      this.id_extends().id_class(var8 && super.id_class(var1, var2, var3, var4, var6) ? id_implements[6] : id_implements[7], var4, id_case[0]);
      return this.id_volatile().id_class(var1, var2, var3, var4, var6);
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      short var10 = id_catch[6];
      rrZl_1 var11 = this.id_volatile();
      rrZH var12 = var11.id_extends();
      this.id_implements()
         .id_class(
            () -> {
               List var11x = this.id_byte();
               AnimValue var12x = this.id_implements().id_class();
               int var13 = this.id_break();
               float var14 = id_throws[14];
               float var15 = id_throws[15];
               var12x.id_class(!this.ai_() ? id_implements[14] : id_implements[15]);
               var12.id_class((float)var13, id_throws[16]);
               float var16 = var12x.id_byte();
               float var17 = (id_throws[17] - var16) * id_throws[18];

               for (int var18 = id_implements[16]; var18 < var11x.size(); var18++) {
                  rrZi_1 var19 = (rrZi_1)var11x.get(var18);
                  var14 += id_throws[19];
                  if (var18 % id_private[9] == 0) {
                     var14 = id_throws[20];
                     var15 += id_throws[21];
                  }

                  var19.id_class(var14, var15 + var12.id_case() + var17);
                  rruv_1 var20 = var19.id_protected();
                  if (!(var20.id_protected() < var4) && !(var20.id_protected() > var4 + id_throws[22] + id_throws[23] + id_throws[24])) {
                     var19.id_class(var1, var2, var7, var8, var20, var9, id_implements[17]);
                  }
               }

               this.id_implements()
                  .id_class(
                     var1,
                     var11,
                     var2,
                     var3 + var5 - id_throws[25],
                     var4 + id_throws[26] + id_throws[27],
                     var7,
                     var8,
                     id_throws[28],
                     id_throws[29],
                     (float)(var13 - id_private[10]),
                     id_catch[24],
                     var9
                  );
            },
            var1,
            var3,
            var4,
            id_throws[0],
            id_throws[1]
         );
      rrvJ.id_class(
         var1,
         var12,
         var3 + id_throws[2] + id_throws[3],
         var4 + id_throws[4] + id_throws[5],
         var4 + id_throws[6] + id_throws[7] - id_throws[8],
         id_throws[9],
         id_throws[10]
      );
      return id_implements[0];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, -43, -26, 62, -71, 3, 22, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_volatile().id_break(var1, var2, var3);
   }

   @Override
   public int id_break() {
      List var1 = this.id_byte();
      return var1.stream()
         .filter(var1x -> var1.indexOf(var1x) % id_private[8] == 0 ? id_implements[8] : id_implements[9])
         .mapToInt(var0 -> var0.id_break() + id_private[7])
         .sum();
   }

   public List<rrZi_1> id_finally() {
      this.id_package();
      return (List<rrZi_1>)this.id_byte[id_catch[21]];
   }

   public rrZH id_extends() {
      return this.id_volatile().id_extends();
   }

   @Override
   public rrZl_1 id_case() {
      return this.id_volatile();
   }

   private static void id_continue() {
      id_private = new byte[]{117, 30, 100, 30, 4, 37, 5, 7, 2, 2, 7, 25, 4, 4, 3, 5, 117, 30, 2, 124, 3, 37, 4};
   }

   private static void id_else() {
      id_implements = new boolean[]{
         true, false, false, true, true, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, true, false
      };
   }

   private static void id_new() {
      id_protected = new String[]{new String("[- ]"), new String("")};
   }

   private void id_package() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_private[13]];
         Object[] var1 = this.id_byte;
         var1[id_private[14]] = Integer.valueOf(id_implements[18]);
      }
   }

   private static void id_super() {
      id_throws = new float[]{
         363.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         253.0F,
         37.0F,
         10.0F,
         253.0F,
         20.0F,
         263.0F,
         266.0F,
         0.5F,
         0.0F,
         0.0F,
         258.0F,
         1.0F,
         5.0F,
         124.0F,
         0.0F,
         37.0F,
         253.0F,
         37.0F,
         10.0F,
         9.0F,
         5.0F,
         37.0F,
         5.0F,
         251.0F
      };
   }

   @Override
   public void id_private() {
      this.id_package();
      super.id_private();
      ((Map)this.id_byte[id_catch[16]]).values().forEach(rrZl_1::id_private);
   }

   private static void id_final() {
      Object[] var0 = new Object[]{117, 30, 124, 37, -15132391};
      id_break = var0;
   }

   public rrZl_1 id_volatile() {
      this.id_package();
      return ((Map)this.id_byte[id_catch[18]]).computeIfAbsent((Category)rrZt_1.id_byte[id_catch[19]], var0 -> new rrZl_1(new rrZH(id_throws[13])));
   }

   public rrvJ id_native() {
      this.id_package();
      return (rrvJ)this.id_byte[id_catch[20]];
   }
}
