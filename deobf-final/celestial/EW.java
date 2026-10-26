package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class EW implements PP, i_1 {
   private static byte[] class_;
   private static String[] case_;
   private static boolean[] catch_;
   private static double[] private_;
   public static Object[] break_;
   private static short[] implements_;
   public Object[] throws_;

   @Override
   public boolean byte_() {
      return (Boolean)this.throws_[10];
   }

   public EW(rU_2 var1, int var2, int var3, int var4, rP_2 var5, EZ var6) {
      this.private_();
      EQ[] var11 = new EQ[((double[])break_[0]).length];
      this.throws_[9] = var11;
      this.throws_[0] = var1;
      Integer var13 = var2;
      this.throws_[1] = var13;
      Integer var14 = var3;
      this.throws_[2] = var14;
      Integer var15 = var4;
      this.throws_[3] = var15;
      this.throws_[4] = var5;
      this.throws_[5] = var6;
      Long2ObjectOpenHashMap var18 = new Long2ObjectOpenHashMap((Integer)C_class.instanceof_().re.class_[0], (Float)C_class.instanceof_().a.class_[0]);
      this.throws_[6] = var18;
   }

   static {
      ntfClinit();
   }

   public double class_(EQ var1) {
      int var2 = (Integer)var1.class_[0] - (Integer)this.throws_[1];
      int var3 = (Integer)var1.class_[1] - (Integer)this.throws_[2];
      int var4 = (Integer)var1.class_[2] - (Integer)this.throws_[3];
      return (double)(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public EQ class_(int var1, int var2, int var3, long var4) {
      EQ var6 = (EQ)((Long2ObjectOpenHashMap)this.throws_[6]).get(var4);
      if (var6 == null) {
         var6 = new EQ(var1, var2, var3, (rP_2)this.throws_[4]);
         ((Long2ObjectOpenHashMap)this.throws_[6]).put(var4, var6);
      }

      return var6;
   }

   @Override
   public synchronized PM class_(long var1, long var3) {
      if ((Boolean)this.throws_[10]) {
         throw new IllegalStateException("Path finder cannot be reused!");
      } else {
         Boolean var13 = false;
         this.throws_[11] = var13;

         PM var7;
         try {
            a_1 var5 = this.break_(var1, var3).map(a_1::private_).orElse(null);
            if ((Boolean)this.throws_[implements_[14]]) {
               return new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[implements_[15]]);
            }

            if (var5 == null) {
               return new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[implements_[17]]);
            }

            int var26 = var5.class_();
            var5 = var5.class_((bw_3)((EZ)this.throws_[implements_[19]]).break_[implements_[20]]);
            if (var5.class_() < var26) {
               PP.a_.byte_(case_[1]);
               PP.a_.byte_("Length decreased by " + (var26 - var5.class_()));
            } else {
               PP.a_.byte_(case_[2]);
            }

            var26 = var5.class_();
            var5 = var5.class_((rP_2)this.throws_[implements_[21]]);
            if (var5.class_() < var26) {
               PP.a_.byte_("Static cutoff " + var26 + " to " + var5.class_());
            }

            if (!((rP_2)this.throws_[implements_[22]]).break_(var5.protected_())) {
               return new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[implements_[25]], var5);
            }

            var7 = new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[implements_[23]], var5);
         } catch (Exception var22) {
            PP.a_.case_("Pathing exception: " + var22);
            var22.printStackTrace();
            return new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[implements_[27]]);
         } finally {
            Boolean var19 = true;
            this.throws_[10] = var19;
         }

         return var7;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -845559611;
   }

   public Optional<a_1> class_(boolean var1, int var2) {
      if ((EQ)this.throws_[7] == null) {
         return Optional.empty();
      } else {
         double var3 = private_[0];

         for (int var5 = 0; var5 < ((double[])break_[0]).length; var5++) {
            if (((EQ[])this.throws_[9])[var5] != null) {
               double var6 = this.class_(((EQ[])this.throws_[9])[var5]);
               if (var6 > var3) {
                  var3 = var6;
               }

               if (var6 > 25.0) {
                  if (var1) {
                     if (((double[])break_[0])[var5] >= 3.0) {
                        System.out.println("Warning: cost coefficient is greater than three! Probably means that");
                        System.out.println("the path I found is pretty terrible (like sneak-bridging for dozens of blocks)");
                        System.out.println("But I'm going to do it anyway, because yolo");
                     }

                     this.byte_("A* cost coefficient " + ((double[])break_[0])[var5]);
                  }

                  return Optional.of(
                     new Ez_1((rU_2)this.throws_[0], (EQ)this.throws_[7], ((EQ[])this.throws_[9])[var5], var2, (rP_2)this.throws_[4], (EZ)this.throws_[5])
                  );
               }
            }
         }

         if (var1) {
            this.byte_(
               "Even with a cost coefficient of "
                  + ((double[])break_[0])[((double[])break_[0]).length - 1]
                  + ", I couldn't get more than "
                  + Math.sqrt(var3)
                  + " blocks"
            );
            this.byte_("No path found =(");
            this.byte_("No path found =(", true);
         }

         return Optional.empty();
      }
   }

   @Override
   public Optional<a_1> class_() {
      return this.class_(false, 0);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7192949053577624458L;
   }

   @Override
   public rP_2 break_() {
      return (rP_2)this.throws_[4];
   }

   public abstract Optional<a_1> break_(long var1, long var3);

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{82, -40, -99, -78, 5, -71, -106, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int throws_() {
      return ((Long2ObjectOpenHashMap)this.throws_[6]).size();
   }

   private static void finally_() {
      implements_ = new short[]{
         0,
         9,
         0,
         1,
         2,
         3,
         4,
         5,
         0,
         0,
         6,
         11,
         10,
         11,
         11,
         3,
         10,
         2,
         10,
         5,
         4,
         4,
         4,
         0,
         10,
         1,
         10,
         4,
         10,
         10,
         0,
         1,
         1,
         2,
         2,
         3,
         6,
         4,
         6,
         8,
         7,
         0,
         9,
         9,
         0,
         0,
         0,
         7,
         9,
         4,
         5,
         0,
         0,
         10,
         4,
         1,
         2,
         3,
         6,
         0,
         7,
         4,
         5
      };
   }

   public void catch_() {
      Boolean var5 = true;
      this.throws_[11] = var5;
   }

   private static void extends_() {
      case_ = new String[]{
         new String("Path finder cannot be reused!"),
         new String("Cutting off path at edge of loaded chunks"),
         new String("Path ends within loaded chunks"),
         new String("Warning: cost coefficient is greater than three! Probably means that"),
         new String("the path I found is pretty terrible (like sneak-bridging for dozens of blocks)"),
         new String("But I'm going to do it anyway, because yolo"),
         new String("No path found =("),
         new String("No path found =(")
      };
   }

   public rU_2 case_() {
      return new rU_2((Integer)this.throws_[1], (Integer)this.throws_[2], (Integer)this.throws_[3]);
   }

   private static void implements_() {
      Object[] var0 = new Object[]{new double[]{1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0}, 5.0, 0.01};
      break_ = var0;
   }

   @Override
   public Optional<a_1> protected_() {
      return Optional.ofNullable((EQ)this.throws_[8])
         .map(var1 -> new Ez_1((rU_2)this.throws_[0], (EQ)this.throws_[7], (EQ)var1, 0, (rP_2)this.throws_[4], (EZ)this.throws_[5]));
   }

   private void private_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[12];
         Object[] var1 = this.throws_;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
         var1[10] = false;
         var1[11] = false;
      }
   }

   private static void final_() {
      catch_ = new boolean[]{
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void volatile_() {
      private_ = new double[]{0.0, 25.0, 3.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 5.0, 0.01};
   }

   private static void native_() {
      class_ = new byte[]{7, 2, 3, 4, 5, 6, 12, 2, 3, 10, 11, 3, 2};
   }
}
