/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXC;
import celestial.rrXD;
import celestial.rrXH;
import celestial.rrXK;
import celestial.rrXU;
import celestial.rrXV;
import celestial.rrXf_1;
import celestial.rrXl_1;
import celestial.rrXo_1;
import celestial.rrXp_1;
import celestial.rrXq_1;
import celestial.rrXt_1;
import celestial.rrXv_1;
import celestial.rrXw_1;
import celestial.rrbb_3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class rrXA {
    private final rrXV id_class;

    private rrXt_1[] id_byte(Deque<rrXK> deque) throws rrXo_1 {
        ArrayList<rrXt_1> arrayList = new ArrayList<rrXt_1>();
        Deque<rrXK> deque2;
        rrXt_1 rrXt_12;
        while ((rrXt_12 = this.id_class(deque2 = rrXA.id_class(deque, rrXU.COMMA, false))) != null) {
            arrayList.add(rrXt_12);
        }
        return arrayList.toArray(new rrXt_1[arrayList.size()]);
    }

    public rrXt_1 id_byte(String string) throws rrXo_1 {
        try {
            rrXK[] rrXKArray = rrXD.id_class(string);
            if (rrXKArray == null) {
                return null;
            }
            ArrayDeque<rrXK> arrayDeque = new ArrayDeque<rrXK>(Arrays.asList(rrXKArray));
            return this.id_class(arrayDeque);
        }
        catch (IOException iOException) {
            throw new rrXo_1(iOException.getMessage(), iOException);
        }
    }

    public rrXA(rrXV rrXV2) {
        this.id_class = rrXV2;
    }

    private rrXq_1 id_class(rrXK rrXK2, Deque<rrXK> deque) throws rrXo_1 {
        rrXK rrXK3 = deque.peek();
        if (rrXK3 != null && rrXK3.id_class() == rrXU.BRACKET_OPEN) {
            rrXq_1 rrXq_12 = rrXq_1.id_class(rrXK2.id_break());
            rrXA.id_class((Object)rrXq_12, "Unknown function: " + rrXK2);
            return rrXq_12;
        }
        rrXq_1 rrXq_13 = rrXq_1.id_class(rrXK2.id_break());
        if (rrXq_13 == null) {
            return null;
        }
        if (rrXq_13.id_class(new rrXt_1[0]) > 0) {
            throw new rrXo_1("Missing arguments: " + rrXq_13);
        }
        return rrXq_13;
    }

    private rrXt_1 id_class(rrXq_1 rrXq_12, Deque<rrXK> deque) throws rrXo_1 {
        rrXK rrXK2;
        if (rrXq_12.id_class(new rrXt_1[0]) == 0 && ((rrXK2 = deque.peek()) == null || rrXK2.id_class() != rrXU.BRACKET_OPEN)) {
            return rrXA.id_class(rrXq_12, new rrXt_1[0]);
        }
        rrXK2 = deque.poll();
        Deque<rrXK> deque2 = rrXA.id_class(deque, rrXU.BRACKET_CLOSE, true);
        rrXt_1[] rrXt_1Array = this.id_byte(deque2);
        return rrXA.id_class(rrXq_12, rrXt_1Array);
    }

    private static rrXt_1 id_class(rrXK rrXK2) throws rrXo_1 {
        float f = rrbb_3.id_class(rrXK2.id_break(), Float.NaN);
        if (f == Float.NaN) {
            throw new rrXo_1("Invalid float value: " + rrXK2);
        }
        return new rrXv_1(f);
    }

    private static rrXt_1 id_class(rrXq_1 rrXq_12, rrXt_1[] rrXt_1Array) throws rrXo_1 {
        rrXC[] rrXCArray = rrXq_12.id_break(rrXt_1Array);
        if (rrXt_1Array.length != rrXCArray.length) {
            throw new rrXo_1("Invalid number of arguments, function: \"" + rrXq_12.id_class() + "\", count arguments: " + rrXt_1Array.length + ", should be: " + rrXCArray.length);
        }
        for (int i = 0; i < rrXt_1Array.length; ++i) {
            rrXC rrXC2;
            rrXt_1 rrXt_12 = rrXt_1Array[i];
            rrXC rrXC3 = rrXt_12.id_byte();
            if (rrXC3 == (rrXC2 = rrXCArray[i])) continue;
            throw new rrXo_1("Invalid argument type, function: \"" + rrXq_12.id_class() + "\", index: " + i + ", type: " + rrXC3 + ", should be: " + rrXC2);
        }
        if (rrXq_12.id_byte() == rrXC.FLOAT) {
            return new rrXH(rrXq_12, rrXt_1Array);
        }
        if (rrXq_12.id_byte() == rrXC.BOOL) {
            return new rrXl_1(rrXq_12, rrXt_1Array);
        }
        if (rrXq_12.id_byte() == rrXC.FLOAT_ARRAY) {
            return new rrXp_1(rrXq_12, rrXt_1Array);
        }
        throw new rrXo_1("Unknown function type: " + rrXq_12.id_byte() + ", function: " + rrXq_12.id_class());
    }

    private static Deque<rrXK> id_class(Deque<rrXK> deque, rrXU rrXU2, boolean bl) throws rrXo_1 {
        ArrayDeque<rrXK> arrayDeque = new ArrayDeque<rrXK>();
        int n = 0;
        Iterator<rrXK> iterator = deque.iterator();
        while (iterator.hasNext()) {
            rrXK rrXK2 = iterator.next();
            iterator.remove();
            if (n == 0 && rrXK2.id_class() == rrXU2) {
                return arrayDeque;
            }
            arrayDeque.add(rrXK2);
            if (rrXK2.id_class() == rrXU.BRACKET_OPEN) {
                ++n;
            }
            if (rrXK2.id_class() != rrXU.BRACKET_CLOSE) continue;
            --n;
        }
        if (bl) {
            throw new rrXo_1("Missing end token: " + rrXU2);
        }
        return arrayDeque;
    }

    private static void id_class(Object object, String string) throws rrXo_1 {
        if (object == null) {
            throw new rrXo_1(string);
        }
    }

    public rrXf_1 id_class(String string) throws rrXo_1 {
        rrXt_1 rrXt_12 = this.id_byte(string);
        if (!(rrXt_12 instanceof rrXf_1)) {
            throw new rrXo_1("Not a float expression: " + rrXt_12.id_byte());
        }
        return (rrXf_1)rrXt_12;
    }

    private rrXt_1 id_class(List<rrXt_1> list, List<rrXK> list2) throws rrXo_1 {
        LinkedList<rrXq_1> linkedList = new LinkedList<rrXq_1>();
        for (rrXK rrXK2 : list2) {
            rrXq_1 rrXq_12 = rrXq_1.id_class(rrXK2.id_break());
            rrXA.id_class((Object)rrXq_12, "Invalid operator: " + rrXK2);
            linkedList.add(rrXq_12);
        }
        return this.id_break(list, linkedList);
    }

    private rrXt_1 id_class(Deque<rrXK> deque) throws rrXo_1 {
        if (deque.isEmpty()) {
            return null;
        }
        LinkedList<rrXt_1> linkedList = new LinkedList<rrXt_1>();
        LinkedList<rrXK> linkedList2 = new LinkedList<rrXK>();
        rrXt_1 rrXt_12 = this.id_break(deque);
        rrXA.id_class(rrXt_12, "Missing expression");
        linkedList.add(rrXt_12);
        rrXK rrXK2;
        while ((rrXK2 = deque.poll()) != null) {
            if (rrXK2.id_class() != rrXU.OPERATOR) {
                throw new rrXo_1("Invalid operator: " + rrXK2);
            }
            rrXt_1 rrXt_13 = this.id_break(deque);
            rrXA.id_class(rrXt_13, "Missing expression");
            linkedList2.add(rrXK2);
            linkedList.add(rrXt_13);
        }
        return this.id_class(linkedList, linkedList2);
    }

    private void id_class(List<rrXt_1> list, List<rrXq_1> list2, int n) throws rrXo_1 {
        for (int i = 0; i < list2.size(); ++i) {
            rrXq_1 rrXq_12 = list2.get(i);
            if (rrXq_12.id_break() != n) continue;
            list2.remove(i);
            rrXt_1 rrXt_12 = list.remove(i);
            rrXt_1 rrXt_13 = list.remove(i);
            rrXt_1 rrXt_14 = rrXA.id_class(rrXq_12, new rrXt_1[]{rrXt_12, rrXt_13});
            list.add(i, rrXt_14);
            --i;
        }
    }

    public rrXw_1 id_break(String string) throws rrXo_1 {
        rrXt_1 rrXt_12 = this.id_byte(string);
        if (!(rrXt_12 instanceof rrXw_1)) {
            throw new rrXo_1("Not a boolean expression: " + rrXt_12.id_byte());
        }
        return (rrXw_1)rrXt_12;
    }

    private rrXt_1 id_break(rrXK rrXK2, Deque<rrXK> deque) throws rrXo_1 {
        Deque<rrXK> deque2 = rrXA.id_class(deque, rrXU.BRACKET_CLOSE, true);
        return this.id_class(deque2);
    }

    private rrXt_1 id_break(Deque<rrXK> deque) throws rrXo_1 {
        rrXK rrXK2 = deque.poll();
        rrXA.id_class(rrXK2, "Missing expression");
        switch (rrXK2.id_class()) {
            case NUMBER: {
                return rrXA.id_class(rrXK2);
            }
            case IDENTIFIER: {
                rrXq_1 rrXq_12 = this.id_class(rrXK2, deque);
                if (rrXq_12 != null) {
                    return this.id_class(rrXq_12, deque);
                }
                return this.id_break(rrXK2);
            }
            case BRACKET_OPEN: {
                return this.id_break(rrXK2, deque);
            }
            case OPERATOR: {
                rrXq_1 rrXq_13 = rrXq_1.id_class(rrXK2.id_break());
                rrXA.id_class((Object)rrXq_13, "Invalid operator: " + rrXK2);
                if (rrXq_13 == rrXq_1.PLUS) {
                    return this.id_break(deque);
                }
                if (rrXq_13 == rrXq_1.MINUS) {
                    rrXt_1 rrXt_12 = this.id_break(deque);
                    return rrXA.id_class(rrXq_1.NEG, new rrXt_1[]{rrXt_12});
                }
                if (rrXq_13 != rrXq_1.NOT) break;
                rrXt_1 rrXt_13 = this.id_break(deque);
                return rrXA.id_class(rrXq_1.NOT, new rrXt_1[]{rrXt_13});
            }
        }
        throw new rrXo_1("Invalid expression: " + rrXK2);
    }

    private rrXt_1 id_break(rrXK rrXK2) throws rrXo_1 {
        if (this.id_class == null) {
            throw new rrXo_1("Model variable not found: " + rrXK2);
        }
        rrXt_1 rrXt_12 = this.id_class.id_byte(rrXK2.id_break());
        if (rrXt_12 == null) {
            throw new rrXo_1("Model variable not found: " + rrXK2);
        }
        return rrXt_12;
    }

    private rrXt_1 id_break(List<rrXt_1> list, List<rrXq_1> list2) throws rrXo_1 {
        if (list.size() != list2.size() + 1) {
            throw new rrXo_1("Invalid infix expression, expressions: " + list.size() + ", operators: " + list2.size());
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        for (rrXq_1 rrXq_12 : list2) {
            n = Math.min(rrXq_12.id_break(), n);
            n2 = Math.max(rrXq_12.id_break(), n2);
        }
        if (n2 >= n && n2 - n <= 10) {
            for (int i = n2; i >= n; --i) {
                this.id_class(list, list2, i);
            }
            if (list.size() == 1 && list2.size() == 0) {
                return list.get(0);
            }
            throw new rrXo_1("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
        }
        throw new rrXo_1("Invalid infix precedence, min: " + n + ", max: " + n2);
    }
}

