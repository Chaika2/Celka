package celestial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class rrki_1 {
   public static Object[] id_byte(Object[] var0, Object var1) {
      ArrayList var2 = new ArrayList<>(Arrays.asList(var0));
      var2.remove(var1);
      return id_class(var2, var0.getClass().getComponentType());
   }

   public static boolean id_class(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   public static String id_class(Object[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            Object var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static Object[] id_class(Collection var0, Class var1) {
      if (var0 == null) {
         return null;
      } else if (var1 == null) {
         return null;
      } else if (var1.isPrimitive()) {
         throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + var1);
      } else {
         Object[] var2 = (Object[])Array.newInstance(var1, var0.size());
         return var0.toArray(var2);
      }
   }

   public static String id_class(float[] var0, String var1, String var2) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var3 = new StringBuffer(var0.length * 5);

         for (int var4 = 0; var4 < var0.length; var4++) {
            float var5 = var0[var4];
            if (var4 > 0) {
               var3.append(var1);
            }

            var3.append(String.format(var2, var5));
         }

         return var3.toString();
      }
   }

   public static String id_class(int[] var0) {
      return id_class(var0, ", ");
   }

   public static String id_class(int[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            int var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static String id_class(Object[] var0) {
      return id_class(var0, ", ");
   }

   public static Object[] id_class(int var0, Object var1) {
      Object[] var2 = (Object[])Array.newInstance(var1.getClass(), var0);
      Arrays.fill(var2, var1);
      return var2;
   }

   public static int[] id_class(int var0, int var1) {
      int[] var2 = new int[var0];
      Arrays.fill(var2, var1);
      return var2;
   }

   public static boolean[] id_class(int var0, boolean var1) {
      boolean[] var2 = new boolean[var0];
      Arrays.fill(var2, var1);
      return var2;
   }

   public static int[] id_class(Integer[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return new int[0];
      } else {
         int[] var1 = new int[var0.length];

         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static boolean id_class(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0 == null ? false : var0.equals(var1);
      }
   }

   public static boolean id_class(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            Object var3 = var1[var2];
            if (id_class(var0, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public static String id_class(boolean[] var0) {
      return id_class(var0, ", ");
   }

   public static Object[] id_class(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList<>(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3.size());
      return var3.toArray(var4);
   }

   public static boolean id_class(Object[] var0, Object var1) {
      if (var0 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var0.length; var2++) {
            Object var3 = var0[var2];
            if (var3 == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean id_class(int[] var0, int var1) {
      if (var0 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static Object[] id_class(Object[] var0, Object[] var1) {
      if (var0 == null) {
         throw new NullPointerException("The given array is NULL");
      } else if (var1.length == 0) {
         return var0;
      } else {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3);
         System.arraycopy(var0, 0, var4, 0, var2);
         System.arraycopy(var1, 0, var4, var2, var1.length);
         return var4;
      }
   }

   public static int[] id_class(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         int[] var4 = new int[var3];
         System.arraycopy(var0, 0, var4, 0, var2);

         for (int var5 = 0; var5 < var1.length; var5++) {
            var4[var5 + var2] = var1[var5];
         }

         return var4;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static String id_class(float[] var0) {
      return id_class(var0, ", ");
   }

   public static String id_class(float[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            float var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static String id_class(boolean[] var0, String var1, int var2) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var3 = new StringBuffer(var0.length * 5);
         int var4 = Math.min(var0.length, var2);

         for (int var5 = 0; var5 < var4; var5++) {
            boolean var6 = var0[var5];
            if (var5 > 0) {
               var3.append(var1);
            }

            var3.append(String.valueOf(var6));
         }

         return var3.toString();
      }
   }

   public static String id_class(boolean[] var0, String var1) {
      return id_class(var0, var1, var0.length);
   }

   public static String id_class(boolean[] var0, int var1) {
      return id_class(var0, ", ", var1);
   }

   public static boolean id_break(Object[] var0) {
      if (var0 == null) {
         return true;
      } else {
         for (Object var4 : var0) {
            if (var4 != null) {
               return false;
            }
         }

         return true;
      }
   }

   public static String id_break(int[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            int var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append("0x");
            var2.append(Integer.toHexString(var4));
         }

         return var2.toString();
      }
   }

   public static Object[] id_break(Object[] var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException("The given array is NULL");
      } else {
         int var2 = var0.length;
         int var3 = var2 + 1;
         Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3);
         System.arraycopy(var0, 0, var4, 0, var2);
         var4[var2] = var1;
         return var4;
      }
   }

   public static boolean id_break(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            Object var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   public static int[] id_break(int[] var0, int var1) {
      return id_class(var0, new int[]{var1});
   }
}
