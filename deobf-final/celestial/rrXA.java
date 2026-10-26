package celestial;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class rrXA {
   private final rrXV class_;

   private rrXt_1[] byte_(Deque<rrXK> var1) throws rrXo_1 {
      ArrayList var2 = new ArrayList();

      while (true) {
         Deque var3 = class_(var1, rrXU.COMMA, false);
         rrXt_1 var4 = this.class_(var3);
         if (var4 == null) {
            return var2.toArray(new rrXt_1[var2.size()]);
         }

         var2.add(var4);
      }
   }

   public rrXt_1 byte_(String var1) throws rrXo_1 {
      try {
         rrXK[] var2 = rrXD.class_(var1);
         if (var2 == null) {
            return null;
         } else {
            ArrayDeque var3 = new ArrayDeque<>(Arrays.asList(var2));
            return this.class_(var3);
         }
      } catch (IOException var4) {
         throw new rrXo_1(var4.getMessage(), var4);
      }
   }

   public rrXA(rrXV var1) {
      this.class_ = var1;
   }

   private rrXq_1 class_(rrXK var1, Deque<rrXK> var2) throws rrXo_1 {
      rrXK var3 = (rrXK)var2.peek();
      if (var3 != null && var3.class_() == rrXU.BRACKET_OPEN) {
         rrXq_1 var5 = rrXq_1.class_(var1.break_());
         class_(var5, "Unknown function: " + var1);
         return var5;
      } else {
         rrXq_1 var4 = rrXq_1.class_(var1.break_());
         if (var4 == null) {
            return null;
         } else if (var4.class_(new rrXt_1[0]) > 0) {
            throw new rrXo_1("Missing arguments: " + var4);
         } else {
            return var4;
         }
      }
   }

   private rrXt_1 class_(rrXq_1 var1, Deque<rrXK> var2) throws rrXo_1 {
      if (var1.class_(new rrXt_1[0]) == 0) {
         rrXK var3 = (rrXK)var2.peek();
         if (var3 == null || var3.class_() != rrXU.BRACKET_OPEN) {
            return class_(var1, new rrXt_1[0]);
         }
      }

      rrXK var6 = (rrXK)var2.poll();
      Deque var4 = class_(var2, rrXU.BRACKET_CLOSE, true);
      rrXt_1[] var5 = this.byte_(var4);
      return class_(var1, var5);
   }

   private static rrXt_1 class_(rrXK var0) throws rrXo_1 {
      float var1 = rrbb_3.class_(var0.break_(), Float.NaN);
      if (var1 == Float.NaN) {
         throw new rrXo_1("Invalid float value: " + var0);
      } else {
         return new rrXv_1(var1);
      }
   }

   private static rrXt_1 class_(rrXq_1 var0, rrXt_1[] var1) throws rrXo_1 {
      rrXC[] var2 = var0.break_(var1);
      if (var1.length != var2.length) {
         throw new rrXo_1("Invalid number of arguments, function: \"" + var0.class_() + "\", count arguments: " + var1.length + ", should be: " + var2.length);
      } else {
         for (int var3 = 0; var3 < var1.length; var3++) {
            rrXt_1 var4 = var1[var3];
            rrXC var5 = var4.byte_();
            rrXC var6 = var2[var3];
            if (var5 != var6) {
               throw new rrXo_1("Invalid argument type, function: \"" + var0.class_() + "\", index: " + var3 + ", type: " + var5 + ", should be: " + var6);
            }
         }

         if (var0.byte_() == rrXC.FLOAT) {
            return new rrXH(var0, var1);
         } else if (var0.byte_() == rrXC.BOOL) {
            return new rrXl_1(var0, var1);
         } else if (var0.byte_() == rrXC.FLOAT_ARRAY) {
            return new rrXp_1(var0, var1);
         } else {
            throw new rrXo_1("Unknown function type: " + var0.byte_() + ", function: " + var0.class_());
         }
      }
   }

   private static Deque<rrXK> class_(Deque<rrXK> var0, rrXU var1, boolean var2) throws rrXo_1 {
      ArrayDeque var3 = new ArrayDeque();
      int var4 = 0;
      Iterator var5 = var0.iterator();

      while (var5.hasNext()) {
         rrXK var6 = (rrXK)var5.next();
         var5.remove();
         if (var4 == 0 && var6.class_() == var1) {
            return var3;
         }

         var3.add(var6);
         if (var6.class_() == rrXU.BRACKET_OPEN) {
            var4++;
         }

         if (var6.class_() == rrXU.BRACKET_CLOSE) {
            var4--;
         }
      }

      if (var2) {
         throw new rrXo_1("Missing end token: " + var1);
      } else {
         return var3;
      }
   }

   private static void class_(Object var0, String var1) throws rrXo_1 {
      if (var0 == null) {
         throw new rrXo_1(var1);
      }
   }

   public rrXf_1 class_(String var1) throws rrXo_1 {
      rrXt_1 var2 = this.byte_(var1);
      if (!(var2 instanceof rrXf_1)) {
         throw new rrXo_1("Not a float expression: " + var2.byte_());
      } else {
         return (rrXf_1)var2;
      }
   }

   private rrXt_1 class_(List<rrXt_1> var1, List<rrXK> var2) throws rrXo_1 {
      LinkedList var3 = new LinkedList();

      for (rrXK var5 : var2) {
         rrXq_1 var6 = rrXq_1.class_(var5.break_());
         class_(var6, "Invalid operator: " + var5);
         var3.add(var6);
      }

      return this.break_(var1, var3);
   }

   private rrXt_1 class_(Deque<rrXK> var1) throws rrXo_1 {
      if (var1.isEmpty()) {
         return null;
      } else {
         LinkedList var2 = new LinkedList();
         LinkedList var3 = new LinkedList();
         rrXt_1 var4 = this.break_(var1);
         class_(var4, "Missing expression");
         var2.add(var4);

         while (true) {
            rrXK var5 = (rrXK)var1.poll();
            if (var5 == null) {
               return this.class_(var2, var3);
            }

            if (var5.class_() != rrXU.OPERATOR) {
               throw new rrXo_1("Invalid operator: " + var5);
            }

            rrXt_1 var6 = this.break_(var1);
            class_(var6, "Missing expression");
            var3.add(var5);
            var2.add(var6);
         }
      }
   }

   private void class_(List<rrXt_1> var1, List<rrXq_1> var2, int var3) throws rrXo_1 {
      for (int var4 = 0; var4 < var2.size(); var4++) {
         rrXq_1 var5 = (rrXq_1)var2.get(var4);
         if (var5.break_() == var3) {
            var2.remove(var4);
            rrXt_1 var6 = (rrXt_1)var1.remove(var4);
            rrXt_1 var7 = (rrXt_1)var1.remove(var4);
            rrXt_1 var8 = class_(var5, new rrXt_1[]{var6, var7});
            var1.add(var4, var8);
            var4--;
         }
      }
   }

   public rrXw_1 break_(String var1) throws rrXo_1 {
      rrXt_1 var2 = this.byte_(var1);
      if (!(var2 instanceof rrXw_1)) {
         throw new rrXo_1("Not a boolean expression: " + var2.byte_());
      } else {
         return (rrXw_1)var2;
      }
   }

   private rrXt_1 break_(rrXK var1, Deque<rrXK> var2) throws rrXo_1 {
      Deque var3 = class_(var2, rrXU.BRACKET_CLOSE, true);
      return this.class_(var3);
   }

   private rrXt_1 break_(Deque<rrXK> var1) throws rrXo_1 {
      rrXK var2 = (rrXK)var1.poll();
      class_(var2, "Missing expression");
      switch (var2.class_()) {
         case NUMBER:
            return class_(var2);
         case IDENTIFIER:
            rrXq_1 var3 = this.class_(var2, var1);
            if (var3 != null) {
               return this.class_(var3, var1);
            }

            return this.break_(var2);
         case BRACKET_OPEN:
            return this.break_(var2, var1);
         case OPERATOR:
            rrXq_1 var4 = rrXq_1.class_(var2.break_());
            class_(var4, "Invalid operator: " + var2);
            if (var4 == rrXq_1.PLUS) {
               return this.break_(var1);
            } else if (var4 == rrXq_1.MINUS) {
               rrXt_1 var6 = this.break_(var1);
               return class_(rrXq_1.NEG, new rrXt_1[]{var6});
            } else if (var4 == rrXq_1.NOT) {
               rrXt_1 var5 = this.break_(var1);
               return class_(rrXq_1.NOT, new rrXt_1[]{var5});
            }
         default:
            throw new rrXo_1("Invalid expression: " + var2);
      }
   }

   private rrXt_1 break_(rrXK var1) throws rrXo_1 {
      if (this.class_ == null) {
         throw new rrXo_1("Model variable not found: " + var1);
      } else {
         rrXt_1 var2 = this.class_.byte_(var1.break_());
         if (var2 == null) {
            throw new rrXo_1("Model variable not found: " + var1);
         } else {
            return var2;
         }
      }
   }

   private rrXt_1 break_(List<rrXt_1> var1, List<rrXq_1> var2) throws rrXo_1 {
      if (var1.size() != var2.size() + 1) {
         throw new rrXo_1("Invalid infix expression, expressions: " + var1.size() + ", operators: " + var2.size());
      } else if (var1.size() == 1) {
         return (rrXt_1)var1.get(0);
      } else {
         int var3 = Integer.MAX_VALUE;
         int var4 = Integer.MIN_VALUE;

         for (rrXq_1 var6 : var2) {
            var3 = Math.min(var6.break_(), var3);
            var4 = Math.max(var6.break_(), var4);
         }

         if (var4 >= var3 && var4 - var3 <= 10) {
            for (int var7 = var4; var7 >= var3; var7--) {
               this.class_(var1, var2, var7);
            }

            if (var1.size() == 1 && var2.size() == 0) {
               return (rrXt_1)var1.get(0);
            } else {
               throw new rrXo_1("Error merging operators, expressions: " + var1.size() + ", operators: " + var2.size());
            }
         } else {
            throw new rrXo_1("Invalid infix precedence, min: " + var3 + ", max: " + var4);
         }
      }
   }
}
