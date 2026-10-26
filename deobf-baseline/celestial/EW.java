package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class EW implements PP, i_1 {
   private static byte[] id_class;
   private static String[] id_case;
   private static boolean[] id_catch;
   private static double[] id_private;
   public static Object[] id_break;
   private static short[] id_implements;
   public Object[] id_throws;

   @Override
   public boolean id_byte() {
      return (Boolean)this.id_throws[id_implements[53]];
   }

   public EW(rU_2 var1, int var2, int var3, int var4, rP_2 var5, EZ var6) {
      this.id_private();
      EQ[] var11 = new EQ[((double[])id_break[id_implements[0]]).length];
      this.id_throws[id_implements[1]] = var11;
      this.id_throws[id_implements[2]] = var1;
      Integer var13 = var2;
      this.id_throws[id_implements[3]] = var13;
      Integer var14 = var3;
      this.id_throws[id_implements[4]] = var14;
      Integer var15 = var4;
      this.id_throws[id_implements[5]] = var15;
      this.id_throws[id_implements[6]] = var5;
      this.id_throws[id_implements[7]] = var6;
      Long2ObjectOpenHashMap var18 = new Long2ObjectOpenHashMap(
         (Integer)C_class.id_instanceof().re.id_class[id_implements[8]], (Float)C_class.id_instanceof().a.id_class[id_implements[9]]
      );
      this.id_throws[id_implements[10]] = var18;
   }

   static {
      ntfClinit();
   }

   public double id_class(EQ var1) {
      int var2 = (Integer)var1.id_class[id_implements[30]] - (Integer)this.id_throws[id_implements[31]];
      int var3 = (Integer)var1.id_class[id_implements[32]] - (Integer)this.id_throws[id_implements[33]];
      int var4 = (Integer)var1.id_class[id_implements[34]] - (Integer)this.id_throws[id_implements[35]];
      return (double)(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public EQ id_class(int var1, int var2, int var3, long var4) {
      EQ var6 = (EQ)((Long2ObjectOpenHashMap)this.id_throws[id_implements[36]]).get(var4);
      if (var6 == null) {
         var6 = new EQ(var1, var2, var3, (rP_2)this.id_throws[id_implements[37]]);
         ((Long2ObjectOpenHashMap)this.id_throws[id_implements[38]]).put(var4, var6);
      }

      return var6;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public synchronized PM id_class(long var1, long var3) {
      if ((Boolean)this.id_throws[id_implements[12]]) {
         throw new IllegalStateException(id_case[0]);
      } else {
         Boolean var13 = id_catch[1];
         this.id_throws[id_implements[13]] = var13;
         boolean var22 = false /* VF: Semaphore variable */;

         PM var30;
         label95: {
            label94: {
               PM var31;
               label93: {
                  label92: {
                     try {
                        var22 = true;
                        a_1 var5 = this.id_break(var1, var3).map(a_1::id_private).orElse(null);
                        if ((Boolean)this.id_throws[id_implements[14]]) {
                           var30 = new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[15]]);
                           var22 = false;
                           break label95;
                        }

                        if (var5 == null) {
                           var30 = new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[17]]);
                           var22 = false;
                           break label94;
                        }

                        int var27 = var5.id_class();
                        var5 = var5.id_class((bw_3)((EZ)this.id_throws[id_implements[19]]).id_break[id_implements[20]]);
                        if (var5.id_class() < var27) {
                           PP.a_.id_byte(id_case[1]);
                           PP.a_.id_byte("Length decreased by " + (var27 - var5.id_class()));
                        } else {
                           PP.a_.id_byte(id_case[2]);
                        }

                        int var28 = var5.id_class();
                        var5 = var5.id_class((rP_2)this.id_throws[id_implements[21]]);
                        if (var5.id_class() < var28) {
                           PP.a_.id_byte("Static cutoff " + var28 + " to " + var5.id_class());
                        }

                        if (((rP_2)this.id_throws[id_implements[22]]).id_break(var5.id_protected())) {
                           var31 = new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[23]], var5);
                           var22 = false;
                           break label93;
                        }

                        var31 = new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[25]], var5);
                        var22 = false;
                        break label92;
                     } catch (Exception var23) {
                        PP.a_.id_case("Pathing exception: " + var23);
                        var23.printStackTrace();
                        var30 = new PM((PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[27]]);
                        var22 = false;
                     } finally {
                        if (var22) {
                           Boolean var19 = id_catch[7];
                           this.id_throws[id_implements[29]] = var19;
                        }
                     }

                     Boolean var18 = id_catch[6];
                     this.id_throws[id_implements[28]] = var18;
                     return var30;
                  }

                  Boolean var17 = id_catch[5];
                  this.id_throws[id_implements[26]] = var17;
                  return var31;
               }

               Boolean var16 = id_catch[4];
               this.id_throws[id_implements[24]] = var16;
               return var31;
            }

            Boolean var15 = id_catch[3];
            this.id_throws[id_implements[18]] = var15;
            return var30;
         }

         Boolean var14 = id_catch[2];
         this.id_throws[id_implements[16]] = var14;
         return var30;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -845559611;
   }

   public Optional<a_1> id_class(boolean var1, int var2) {
      if ((EQ)this.id_throws[id_implements[40]] == null) {
         return Optional.empty();
      } else {
         double var3 = id_private[0];

         for (int var5 = id_catch[10]; var5 < ((double[])id_break[id_implements[41]]).length; var5++) {
            if (((EQ[])this.id_throws[id_implements[42]])[var5] != null) {
               double var6 = this.id_class(((EQ[])this.id_throws[id_implements[43]])[var5]);
               if (var6 > var3) {
                  var3 = var6;
               }

               if (var6 > id_private[1]) {
                  if (var1) {
                     if (((double[])id_break[id_implements[44]])[var5] >= id_private[2]) {
                        System.out.println(id_case[3]);
                        System.out.println(id_case[4]);
                        System.out.println(id_case[5]);
                     }

                     this.id_byte("A* cost coefficient " + ((double[])id_break[id_implements[45]])[var5]);
                  }

                  return Optional.of(
                     new Ez_1(
                        (rU_2)this.id_throws[id_implements[46]],
                        (EQ)this.id_throws[id_implements[47]],
                        ((EQ[])this.id_throws[id_implements[48]])[var5],
                        var2,
                        (rP_2)this.id_throws[id_implements[49]],
                        (EZ)this.id_throws[id_implements[50]]
                     )
                  );
               }
            }
         }

         if (var1) {
            this.id_byte(
               "Even with a cost coefficient of "
                  + ((double[])id_break[id_implements[51]])[((double[])id_break[id_implements[52]]).length - id_catch[11]]
                  + ", I couldn't get more than "
                  + Math.sqrt(var3)
                  + " blocks"
            );
            this.id_byte(id_case[6]);
            this.id_byte(id_case[7], id_catch[12]);
         }

         return Optional.empty();
      }
   }

   @Override
   public Optional<a_1> id_class() {
      return this.id_class(id_catch[8], id_catch[9]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7192949053577624458L;
   }

   @Override
   public rP_2 id_break() {
      return (rP_2)this.id_throws[id_implements[54]];
   }

   public abstract Optional<a_1> id_break(long var1, long var3);

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{82, -40, -99, -78, 5, -71, -106, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_throws() {
      return ((Long2ObjectOpenHashMap)this.id_throws[id_implements[58]]).size();
   }

   private static void id_finally() {
      id_implements = new short[]{
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

   public void id_catch() {
      Boolean var5 = id_catch[0];
      this.id_throws[id_implements[11]] = var5;
   }

   private static void id_extends() {
      id_case = new String[]{
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

   public rU_2 id_case() {
      return new rU_2((Integer)this.id_throws[id_implements[55]], (Integer)this.id_throws[id_implements[56]], (Integer)this.id_throws[id_implements[57]]);
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{new double[]{1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0}, 5.0, 0.01};
      id_break = var0;
   }

   @Override
   public Optional<a_1> id_protected() {
      return Optional.ofNullable((EQ)this.id_throws[id_implements[39]])
         .map(
            var1 -> new Ez_1(
                  (rU_2)this.id_throws[id_implements[59]],
                  (EQ)this.id_throws[id_implements[60]],
                  (EQ)var1,
                  id_catch[13],
                  (rP_2)this.id_throws[id_implements[61]],
                  (EZ)this.id_throws[id_implements[62]]
               )
         );
   }

   private void id_private() {
      if (this.id_throws == null) {
         this.id_throws = new Object[id_class[6]];
         Object[] var1 = this.id_throws;
         var1[id_catch[17]] = Integer.valueOf(id_catch[18]);
         var1[id_class[7]] = Integer.valueOf(id_catch[19]);
         var1[id_class[8]] = Integer.valueOf(id_catch[20]);
         var1[id_class[9]] = id_catch[21];
         var1[id_class[10]] = id_catch[22];
      }
   }

   private static void id_final() {
      id_catch = new boolean[]{
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

   private static void id_volatile() {
      id_private = new double[]{0.0, 25.0, 3.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 5.0, 0.01};
   }

   private static void id_native() {
      id_class = new byte[]{7, 2, 3, 4, 5, 6, 12, 2, 3, 10, 11, 3, 2};
   }
}
