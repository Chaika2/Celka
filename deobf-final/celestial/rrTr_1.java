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
   private static byte[] byte_;
   private static double[] protected_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] throws_;
   private static float[] case_;
   private static boolean[] catch_;

   public void byte_() {
      if (!((Int2ObjectMap)this.class_[1]).isEmpty()) {
         ((Int2ObjectMap)this.class_[1]).keySet().removeIf(var1 -> !((Int2ObjectMap)this.class_[0]).containsKey(var1) ? true : catch_[21]);
      }

      if (!((Int2ObjectMap)this.class_[2]).isEmpty()) {
         ((Int2ObjectMap)this.class_[2]).keySet().removeIf(var1 -> !((Int2ObjectMap)this.class_[0]).containsKey(var1) ? true : catch_[19]);
      }
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1361923474;
   }

   public rrTr_1() {
      this.final_();
      Int2ObjectOpenHashMap var5 = new Int2ObjectOpenHashMap();
      this.class_[0] = var5;
      Int2ObjectOpenHashMap var6 = new Int2ObjectOpenHashMap();
      this.class_[1] = var6;
      Int2ObjectOpenHashMap var7 = new Int2ObjectOpenHashMap();
      this.class_[2] = var7;
      ArrayList var8 = new ArrayList();
      this.class_[3] = var8;
      IntOpenHashSet var9 = new IntOpenHashSet();
      this.class_[4] = var9;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5143998480859913334L;
   }

   private void class_(List<Integer> var1, int var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = 0;

      for (int var9 = 0; var8 < var2; var9++) {
         int var10 = Math.min(var7 - var9, var2 - var8);
         float var11 = var4 - (float)var9 * (var6 + 2.0F);
         this.class_(var1, var8, var10, var3, var11, var5);
         var8 += var10;
      }
   }

   private static boolean class_(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      return var0 + var4 + var6 > var2 && var2 + var4 + var6 > var0 && var1 + var5 + var6 > var3 && var3 + var5 + var6 > var1 ? true : catch_[15];
   }

   private void class_(List<Integer> var1, int var2, int var3, float var4, float var5, float var6) {
      float var7 = (float)var3 * var6 + (float)(var3 - 1) * 2.0F;
      float var8 = var4 - var7 * 0.5F;

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = (Integer)var1.get(var2 + var9);
         float var11 = var8 + (float)var9 * (var6 + 2.0F);
         rrTP var12 = (rrTP)((List)this.class_[3]).get(var10);
         ((List)this.class_[3])
            .set(var10, new rrTP(var12.protected_(), var11, var5, var12.throws_(), var12.class_(), var12.case_(), var12.byte_(), var12.catch_()));
      }
   }

   public boolean class_(int var1) {
      return ((IntOpenHashSet)this.class_[4]).contains(var1);
   }

   private static int class_(int[] var0, int var1) {
      while (var0[var1] != var1) {
         var0[var1] = var0[var0[var1]];
         var1 = var0[var1];
      }

      return var1;
   }

   public void class_(rsE_2 var1) {
      ((Int2ObjectMap)this.class_[0]).put(var1.V(), var1);
   }

   private List<List<Integer>> class_(float var1, float var2) {
      int var3 = ((List)this.class_[3]).size();
      int[] var4 = new int[var3];
      int var5 = 0;

      while (var5 < var3) {
         var4[var5] = var5++;
      }

      for (int var9 = catch_[5]; var9 < var3; var9++) {
         rrTP var6 = (rrTP)((List)this.class_[3]).get(var9);

         for (int var7 = var9 + 1; var7 < var3; var7++) {
            rrTP var8 = (rrTP)((List)this.class_[3]).get(var7);
            if (class_(var6.private_(), var6.break_(), var8.private_(), var8.break_(), var1, var2, 2.0F)) {
               class_(var4, var9, var7);
            }
         }
      }

      Int2ObjectOpenHashMap var10 = new Int2ObjectOpenHashMap();

      for (int var11 = 0; var11 < var3; var11++) {
         ((List)var10.computeIfAbsent(class_(var4, var11), var0 -> new ArrayList())).add(var11);
      }

      return new ArrayList<>(var10.values());
   }

   private void class_(List<Integer> var1, float var2, float var3) {
      int var4 = var1.size();
      float var5 = 0.0F;
      float var6 = Float.NEGATIVE_INFINITY;

      for (int var8 : var1) {
         rrTP var9 = (rrTP)((List)this.class_[3]).get(var8);
         var5 += var9.private_();
         if (var9.break_() > var6) {
            var6 = var9.break_();
         }
      }

      float var10 = var5 / (float)var4 + var2 * 0.5F;
      int var11 = (int)Math.ceil((-1.0 + Math.sqrt(1.0 + 8.0 * (double)var4)) / 2.0);
      if (var11 <= 4) {
         this.class_(var1, var4, var10, var6, var2, var3, var11);
      } else {
         this.break_(var1, var4, var10, var6, var2, var3, 4);
      }
   }

   public void class_(Ml_1 var1) {
      if (!((List)this.class_[3]).isEmpty()) {
         ShulkerPreview.class_(var1, (List<? extends rrTu_1>)this.class_[3]);
         ((List)this.class_[3]).clear();
      }
   }

   private IJ[] class_(int var1, List<rdn_3> var2) {
      IJ[] var3 = (IJ[])((Int2ObjectMap)this.class_[2]).get(var1);
      if (var3 != null && var3.length == var2.size()) {
         return var3;
      } else {
         Hz_1 var4 = QY.instanceof_().float_();
         IJ[] var5 = new IJ[var2.size()];

         for (int var6 = 0; var6 < var5.length; var6++) {
            rdn_3 var7 = (rdn_3)var2.get(var6);
            if (var7 != null && !var7.class_()) {
               var5[var6] = var4.class_(var7, null, null);
            }
         }

         ((Int2ObjectMap)this.class_[2]).put(var1, var5);
         return var5;
      }
   }

   public void class_(rjV_2 var1, float var2) {
      ((List)this.class_[3]).clear();
      this.break_(var1, var2);
      this.private_();
      ((List)this.class_[3]).sort(Comparator.comparingInt(rrTP::case_));
      this.extends_();
   }

   public void class_() {
      ((IntOpenHashSet)this.class_[4]).clear();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -110, 29, 53, 101, -56, -84, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_(int[] var0, int var1, int var2) {
      int var3 = class_(var0, var1);
      int var4 = class_(var0, var2);
      if (var3 != var4) {
         var0[var3] = var4;
      }
   }

   private void break_(List<Integer> var1, int var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = 0;

      for (int var9 = 0; var8 < var2; var9++) {
         int var10 = Math.min(var7, var2 - var8);
         float var11 = var4 - (float)var9 * (var6 + 2.0F);
         this.class_(var1, var8, var10, var3, var11, var5);
         var8 += var10;
      }
   }

   public void break_() {
      ((Int2ObjectMap)this.class_[0]).clear();
   }

   private void break_(rjV_2 var1, float var2) {
      float var3 = 88.0F;
      float var4 = 39.0F;
      ObjectIterator var5 = ((Int2ObjectMap)this.class_[0]).values().iterator();

      while (var5.hasNext()) {
         rsE_2 var6 = (rsE_2)var5.next();
         rdn_3 var7 = var6.protected_();
         rdb_3 var10 = var7.break_();
         if (var10 instanceof rxJ_2) {
            rxJ_2 var8 = (rxJ_2)var10;
            xd_3 var17 = var8.catch_();
            if (var17 instanceof Wp_1) {
               Wp_1 var9 = (Wp_1)var17;
               int var18 = var6.V();
               List var11 = (List)((Int2ObjectMap)this.class_[1]).get(var18);
               if (var11 == null) {
                  var11 = rrjm_3.class_(var7);
                  ((Int2ObjectMap)this.class_[1]).put(var18, var11);
               }

               if (!var11.isEmpty()) {
                  rji_3 var12 = rrfa_3.class_(var1, var6, var2);
                  if (var12.class_() != Float.MAX_VALUE && var12.byte_() != Float.MIN_VALUE) {
                     float var13 = (var12.class_() + var12.byte_()) * 0.5F - var3 * 0.5F;
                     float var14 = var12.break_() - var4 - 2.0F;
                     ((IntOpenHashSet)this.class_[4]).add(var18);
                     float[] var15 = ShulkerPreview.class_(var9.break_());
                     IJ[] var16 = this.class_(var18, var11);
                     ((List)this.class_[3]).add(new rrTP(var11, var13, var14, var15, 0.5F, var18, var7.continue_(), var16));
                  }
               }
            }
         }
      }
   }

   public boolean throws_() {
      return !((Int2ObjectMap)this.class_[0]).isEmpty() ? true : catch_[1];
   }

   private static void finally_() {
      throws_ = new short[]{0, 1, 2, 3, 4, 0, 0, 0, 1, 2, 3, 4, 4, 0, 4, 3, 3, 1, 1, 2, 2, 3, 3, 3, 3, 3, 0, 1, 1, 4, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 0, 0};
   }

   private static void catch_() {
      case_ = new float[]{
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

   private void extends_() {
      int var1 = ((List)this.class_[3]).size();
      if (var1 >= 2) {
         float var2 = case_[10];
         float var3 = 39.0F;

         for (List var5 : this.class_(var2, var3)) {
            if (var5.size() > 1) {
               this.class_(var5, var2, var3);
            }
         }
      }
   }

   private static void case_() {
      protected_ = new double[]{-1.0, 1.0, 8.0, 2.0};
   }

   private static void implements_() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 4};
      break_ = var0;
   }

   public void protected_() {
      ((Int2ObjectMap)this.class_[0]).clear();
      ((Int2ObjectMap)this.class_[1]).clear();
      ((Int2ObjectMap)this.class_[2]).clear();
      ((List)this.class_[3]).clear();
      ((IntOpenHashSet)this.class_[4]).clear();
   }

   private void private_() {
      if (!((List)this.class_[3]).isEmpty()) {
         float var1 = case_[0];
         float var2 = 39.0F;
         float var3 = import_.else_().volatile_();
         float var4 = import_.else_().final_();
         ((List)this.class_[3])
            .removeIf(
               var4x -> !(var4x.private_() + var1 < 0.0F) && !(var4x.private_() > var3) && !(var4x.break_() + var2 < 0.0F) && !(var4x.break_() > var4)
                     ? catch_[17]
                     : catch_[16]
            );
      }
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
      }
   }

   private static void volatile_() {
      catch_ = new boolean[]{
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

   private static void native_() {
      byte_ = new byte[]{2, 4, 4, 5, 4, 2, 3, 4};
   }
}
