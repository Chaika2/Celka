package celestial;

public interface rjN_2 {
   rjN_2 class_ = (var0, var1) -> false;
   rjN_2 break_ = (var0, var1) -> !var0 && !var1;
   rjN_2 byte_ = (var0, var1) -> var1 && !var0;
   rjN_2 protected_ = (var0, var1) -> !var0;
   rjN_2 throws_ = (var0, var1) -> var0 && !var1;
   rjN_2 case_ = (var0, var1) -> !var1;
   rjN_2 catch_ = (var0, var1) -> var0 != var1;
   rjN_2 private_ = (var0, var1) -> !var0 || !var1;
   rjN_2 implements_ = (var0, var1) -> var0 && var1;
   rjN_2 finally_ = (var0, var1) -> var0 == var1;
   rjN_2 extends_ = (var0, var1) -> var1;
   rjN_2 native_ = (var0, var1) -> !var0 || var1;
   rjN_2 volatile_ = (var0, var1) -> var0;
   rjN_2 final_ = (var0, var1) -> var0 || !var1;
   rjN_2 package_ = (var0, var1) -> var0 || var1;
   rjN_2 int_ = (var0, var1) -> true;

   boolean apply(boolean var1, boolean var2);
}
