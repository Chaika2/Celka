package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTr_1 implements MinecraftAccessor {
   private static byte[] id_byte;
   private static double[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_throws;
   private static float[] id_case;
   private static boolean[] id_catch;

   public void id_byte() {
      if (!((Int2ObjectMap)this.id_class[1]).isEmpty()) {
         ((Int2ObjectMap)this.id_class[1]).keySet().removeIf(var1 -> !((Int2ObjectMap)this.id_class[id_throws[41]]).containsKey(var1) ? true : id_catch[21]);
      }

      if (!((Int2ObjectMap)this.id_class[2]).isEmpty()) {
         ((Int2ObjectMap)this.id_class[2]).keySet().removeIf(var1 -> !((Int2ObjectMap)this.id_class[id_throws[40]]).containsKey(var1) ? true : id_catch[19]);
      }
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1361923474;
   }

   public rrTr_1() {
      this.id_final();
      Int2ObjectOpenHashMap var5 = new Int2ObjectOpenHashMap();
      this.id_class[id_throws[0]] = var5;
      Int2ObjectOpenHashMap var6 = new Int2ObjectOpenHashMap();
      this.id_class[1] = var6;
      Int2ObjectOpenHashMap var7 = new Int2ObjectOpenHashMap();
      this.id_class[2] = var7;
      ArrayList var8 = new ArrayList();
      this.id_class[3] = var8;
      IntOpenHashSet var9 = new IntOpenHashSet();
      this.id_class[4] = var9;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5143998480859913334L;
   }

   private void id_class(List<Integer> var1, int var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = id_catch[8];

      for (int var9 = id_catch[9]; var8 < var2; var9++) {
         int var10 = Math.min(var7 - var9, var2 - var8);
         float var11 = var4 - (float)var9 * (var6 + 2.0F);
         this.id_class(var1, var8, var10, var3, var11, var5);
         var8 += var10;
      }
   }

   private static boolean id_class(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      return var0 + var4 + var6 > var2 && var2 + var4 + var6 > var0 && var1 + var5 + var6 > var3 && var3 + var5 + var6 > var1 ? true : id_catch[15];
   }

   private void id_class(List<Integer> var1, int var2, int var3, float var4, float var5, float var6) {
      float var7 = (float)var3 * var6 + (float)(var3 - 1) * 2.0F;
      float var8 = var4 - var7 * 0.5F;

      for (int var9 = id_catch[13]; var9 < var3; var9++) {
         int var10 = (Integer)var1.get(var2 + var9);
         float var11 = var8 + (float)var9 * (var6 + 2.0F);
         rrTP var12 = (rrTP)((List)this.id_class[3]).get(var10);
         ((List)this.id_class[3])
            .set(var10, new rrTP(var12.id_protected(), var11, var5, var12.id_throws(), var12.id_class(), var12.id_case(), var12.id_byte(), var12.id_catch()));
      }
   }

   public boolean id_class(int var1) {
      return ((IntOpenHashSet)this.id_class[4]).contains(var1);
   }

   private static int id_class(int[] var0, int var1) {
      while (var0[var1] != var1) {
         var0[var1] = var0[var0[var1]];
         var1 = var0[var1];
      }

      return var1;
   }

   public void id_class(rsE_2 var1) {
      ((Int2ObjectMap)this.id_class[id_throws[5]]).put(var1.V(), var1);
   }

   private List<List<Integer>> id_class(float var1, float var2) {
      int var3 = ((List)this.id_class[3]).size();
      int[] var4 = new int[var3];
      int var5 = id_catch[4];

      while (var5 < var3) {
         var4[var5] = var5++;
      }

      for (int var9 = id_catch[5]; var9 < var3; var9++) {
         rrTP var6 = (rrTP)((List)this.id_class[3]).get(var9);

         for (int var7 = var9 + 1; var7 < var3; var7++) {
            rrTP var8 = (rrTP)((List)this.id_class[3]).get(var7);
            if (id_class(var6.id_private(), var6.id_break(), var8.id_private(), var8.id_break(), var1, var2, 2.0F)) {
               id_class(var4, var9, var7);
            }
         }
      }

      Int2ObjectOpenHashMap var10 = new Int2ObjectOpenHashMap();

      for (int var11 = id_catch[7]; var11 < var3; var11++) {
         ((List)var10.computeIfAbsent(id_class(var4, var11), var0 -> new ArrayList())).add(var11);
      }

      return new ArrayList<>(var10.values());
   }

   private void id_class(List<Integer> var1, float var2, float var3) {
      int var4 = var1.size();
      float var5 = id_case[13];
      float var6 = Float.NEGATIVE_INFINITY;

      for (int var8 : var1) {
         rrTP var9 = (rrTP)((List)this.id_class[3]).get(var8);
         var5 += var9.id_private();
         if (var9.id_break() > var6) {
            var6 = var9.id_break();
         }
      }

      float var10 = var5 / (float)var4 + var2 * 0.5F;
      int var11 = (int)Math.ceil((-1.0 + Math.sqrt(1.0 + 8.0 * (double)var4)) / 2.0);
      if (var11 <= 4) {
         this.id_class(var1, var4, var10, var6, var2, var3, var11);
      } else {
         this.id_break(var1, var4, var10, var6, var2, var3, 4);
      }
   }

   public void id_class(Ml_1 var1) {
      if (!((List)this.id_class[3]).isEmpty()) {
         ShulkerPreview.id_class(var1, (List<? extends rrTu_1>)this.id_class[3]);
         ((List)this.id_class[3]).clear();
      }
   }

   private IJ[] id_class(int var1, List<rdn_3> var2) {
      IJ[] var3 = (IJ[])((Int2ObjectMap)this.id_class[2]).get(var1);
      if (var3 != null && var3.length == var2.size()) {
         return var3;
      } else {
         Hz_1 var4 = QY.id_instanceof().id_float();
         IJ[] var5 = new IJ[var2.size()];

         for (int var6 = id_catch[2]; var6 < var5.length; var6++) {
            rdn_3 var7 = (rdn_3)var2.get(var6);
            if (var7 != null && !var7.id_class()) {
               var5[var6] = var4.id_class(var7, null, null);
            }
         }

         ((Int2ObjectMap)this.id_class[2]).put(var1, var5);
         return var5;
      }
   }

   public void id_class(rjV_2 var1, float var2) {
      ((List)this.id_class[3]).clear();
      this.id_break(var1, var2);
      this.id_private();
      ((List)this.id_class[3]).sort(Comparator.comparingInt(rrTP::id_case));
      this.id_extends();
   }

   public void id_class() {
      ((IntOpenHashSet)this.id_class[4]).clear();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -110, 29, 53, 101, -56, -84, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class(int[] var0, int var1, int var2) {
      int var3 = id_class(var0, var1);
      int var4 = id_class(var0, var2);
      if (var3 != var4) {
         var0[var3] = var4;
      }
   }

   private void id_break(List<Integer> var1, int var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = id_catch[10];

      for (int var9 = id_catch[11]; var8 < var2; var9++) {
         int var10 = Math.min(var7, var2 - var8);
         float var11 = var4 - (float)var9 * (var6 + 2.0F);
         this.id_class(var1, var8, var10, var3, var11, var5);
         var8 += var10;
      }
   }

   public void id_break() {
      ((Int2ObjectMap)this.id_class[id_throws[6]]).clear();
   }

   private void id_break(rjV_2 var1, float var2) {
      float var3 = 88.0F;
      float var4 = 39.0F;
      ObjectIterator var5 = ((Int2ObjectMap)this.id_class[id_throws[26]]).values().iterator();

      while (var5.hasNext()) {
         rsE_2 var6 = (rsE_2)var5.next();
         rdn_3 var7 = var6.id_protected();
         rdb_3 var10 = var7.id_break();
         if (var10 instanceof rxJ_2) {
            rxJ_2 var8 = (rxJ_2)var10;
            xd_3 var17 = var8.id_catch();
            if (var17 instanceof Wp_1) {
               Wp_1 var9 = (Wp_1)var17;
               int var18 = var6.V();
               List var11 = (List)((Int2ObjectMap)this.id_class[1]).get(var18);
               if (var11 == null) {
                  var11 = rrjm_3.id_class(var7);
                  ((Int2ObjectMap)this.id_class[1]).put(var18, var11);
               }

               if (!var11.isEmpty()) {
                  rji_3 var12 = rrfa_3.id_class(var1, var6, var2);
                  if (var12.id_class() != Float.MAX_VALUE && var12.id_byte() != Float.MIN_VALUE) {
                     float var13 = (var12.id_class() + var12.id_byte()) * 0.5F - var3 * 0.5F;
                     float var14 = var12.id_break() - var4 - 2.0F;
                     ((IntOpenHashSet)this.id_class[4]).add(var18);
                     float[] var15 = ShulkerPreview.id_class(var9.id_break());
                     IJ[] var16 = this.id_class(var18, var11);
                     ((List)this.id_class[3]).add(new rrTP(var11, var13, var14, var15, 0.5F, var18, var7.id_continue(), var16));
                  }
               }
            }
         }
      }
   }

   public boolean id_throws() {
      return !((Int2ObjectMap)this.id_class[id_throws[13]]).isEmpty() ? true : id_catch[1];
   }

   private static void id_finally() {
      id_throws = new short[]{0, 1, 2, 3, 4, 0, 0, 0, 1, 2, 3, 4, 4, 0, 4, 3, 3, 1, 1, 2, 2, 3, 3, 3, 3, 3, 0, 1, 1, 4, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 0, 0};
   }

   private static void id_catch() {
      id_case = new float[]{
         88.0F,
         39.0F,
         88.0F,
         39.0F,
         Float.MAX_VALUE,
         Float.MIN_VALUE,
         0.5F,
         0.5F,
         2.0F,
         0.5F,
         88.0F,
         39.0F,
         2.0F,
         0.0F,
         Float.NEGATIVE_INFINITY,
         0.5F,
         2.0F,
         2.0F,
         2.0F,
         0.5F,
         2.0F,
         0.0F,
         0.0F,
         0.5F,
         2.0F,
         2.0F
      };
   }

   private void id_extends() {
      int var1 = ((List)this.id_class[3]).size();
      if (var1 >= 2) {
         float var2 = 88.0F;
         float var3 = 39.0F;

         for (List var5 : this.id_class(var2, var3)) {
            if (var5.size() > 1) {
               this.id_class(var5, var2, var3);
            }
         }
      }
   }

   private static void id_case() {
      id_protected = new double[]{-1.0, 1.0, 8.0, 2.0};
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 4};
      id_break = var0;
   }

   public void id_protected() {
      ((Int2ObjectMap)this.id_class[id_throws[7]]).clear();
      ((Int2ObjectMap)this.id_class[1]).clear();
      ((Int2ObjectMap)this.id_class[2]).clear();
      ((List)this.id_class[3]).clear();
      ((IntOpenHashSet)this.id_class[4]).clear();
   }

   private void id_private() {
      if (!((List)this.id_class[3]).isEmpty()) {
         float var1 = 88.0F;
         float var2 = 39.0F;
         float var3 = id_import.id_else().id_volatile();
         float var4 = id_import.id_else().id_final();
         ((List)this.id_class[3])
            .removeIf(
               var4x -> !(var4x.id_private() + var1 < id_case[21])
                        && !(var4x.id_private() > var3)
                        && !(var4x.id_break() + var2 < id_case[22])
                        && !(var4x.id_break() > var4)
                     ? id_catch[17]
                     : true
            );
      }
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
      }
   }

   private static void id_volatile() {
      id_catch = new boolean[]{
         true,
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
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true
      };
   }

   private static void id_native() {
      id_byte = new byte[]{2, 4, 4, 5, 4, 2, 3, 4};
   }
}
