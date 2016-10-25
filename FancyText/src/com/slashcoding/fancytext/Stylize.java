package com.slashcoding.fancytext;

import android.app.Activity;
import java.util.Random;

public class Stylize extends Activity {
	char[] A;
	String r;
	int i, len;

	public String mixedstyle(String t) {
		char a[] = { 'α', 'Á', '4', 'ค' }, b[] = { 'в', 'ß', '๒' }, c[] = {
				'¢', 'Č', 'ς' }, d[] = { '∂', 'Ď', '๔' }, o[] = {
				'σ', 'Ő', '0', '๏' }, e[] = { 'є', 'Ĕ', '3', 'є' }, p[] = {
				'ρ', 'P',  'ק' }, f[] = { 'ƒ', 'Ŧ', 'Ŧ' }, q[] = {
				'q', 'Q',  'ợ' }, g[] = { 'g', 'Ğ',  'ﻮ' }, R[] = {
				'я', 'Ŕ',  'г' }, h[] = { 'н', 'Ĥ',  'ђ' }, s[] = {
				'ѕ', 'Ś', '5', 'ร' }, I[] = { 'ι', 'Ĩ', '1', 'เ' }, T[] = {
				'т', 'Ť', '7', 't' }, j[] = { 'נ', 'Ĵ',  'ן' }, u[] = {
				'υ', 'Ú',  'ย' }, k[] = { 'к', 'Ķ', 'к' }, v[] = {
				'ν', 'V',  'ש' }, l[] = { 'ℓ', 'Ĺ',  'l' }, w[] = {
				'ω', 'Ŵ',  'ฬ' }, m[] = { 'м', 'M',  '๓' }, x[] = {
				'χ', 'Ж',  'א' }, n[] = { 'η', 'Ń',  'ภ' }, y[] = {
				'у', 'Ŷ',  'ץ' }, z[] = { 'z', 'Ź', 'z' };
		Random next = new Random();
		A = t.toCharArray();
		i = 0;
		len = t.length();
		while (i < len) {
			switch (A[i]) {
			case 'a':
			case 'A':
				A[i] = a[next.nextInt(4)];
				break;
			case 'b':
			case 'B':
				A[i] = b[next.nextInt(3)];
				break;
			case 'c':
			case 'C':
				A[i] = c[next.nextInt(3)];
				break;
			case 'd':
			case 'D':
				A[i] = d[next.nextInt(3)];
				break;
			case 'e':
			case 'E':
				A[i] = e[next.nextInt(4)];
				break;
			case 'f':
			case 'F':
				A[i] = f[next.nextInt(3)];
				break;
			case 'g':
			case 'G':
				A[i] = g[next.nextInt(3)];
				break;
			case 'h':
			case 'H':
				A[i] = h[next.nextInt(3)];
				break;
			case 'i':
			case 'I':
				A[i] = I[next.nextInt(4)];
				break;
			case 'j':
			case 'J':
				A[i] = j[next.nextInt(3)];
				break;
			case 'k':
			case 'K':
				A[i] = k[next.nextInt(3)];
				break;
			case 'l':
			case 'L':
				A[i] = l[next.nextInt(3)];
				break;
			case 'm':
			case 'M':
				A[i] = m[next.nextInt(3)];
				break;
			case 'n':
			case 'N':
				A[i] = n[next.nextInt(3)];
				break;
			case 'o':
			case 'O':
				A[i] = o[next.nextInt(4)];
				break;
			case 'p':
			case 'P':
				A[i] = p[next.nextInt(3)];
				break;
			case 'q':
			case 'Q':
				A[i] = q[next.nextInt(3)];
				break;
			case 'r':
			case 'R':
				A[i] = R[next.nextInt(3)];
				break;
			case 's':
			case 'S':
				A[i] = s[next.nextInt(4)];
				break;
			case 't':
			case 'T':
				A[i] = T[next.nextInt(4)];
				break;
			case 'u':
			case 'U':
				A[i] = u[next.nextInt(3)];
				break;
			case 'v':
			case 'V':
				A[i] = v[next.nextInt(3)];
				break;
			case 'w':
			case 'W':
				A[i] = w[next.nextInt(3)];
				break;
			case 'x':
			case 'X':
				A[i] = x[next.nextInt(3)];
				break;
			case 'y':
			case 'Y':
				A[i] = y[next.nextInt(3)];
				break;
			case 'z':
			case 'Z':
				A[i] = z[next.nextInt(3)];
				break;
			}
			i++;
		}
		r = String.valueOf(A);
		return r;
	}

	public String style1(String t) {
		A = t.toCharArray();
		i = 0;
		len = t.length();
		while (i < len) {
			switch (A[i]) {
			case 'a':
			case 'A':
				A[i] = 'α';
				break;
			case 'b':
			case 'B':
				A[i] = 'в';
				break;
			case 'c':
			case 'C':
				A[i] = '¢';
				break;
			case 'd':
			case 'D':
				A[i] = '∂';
				break;
			case 'e':
			case 'E':
				A[i] = 'є';
				break;
			case 'f':
			case 'F':
				A[i] = 'ƒ';
				break;
			case 'g':
			case 'G':
				A[i] = 'g';
				break;
			case 'h':
			case 'H':
				A[i] = 'н';
				break;
			case 'i':
			case 'I':
				A[i] = 'ι';
				break;
			case 'j':
			case 'J':
				A[i] = 'נ';
				break;
			case 'k':
			case 'K':
				A[i] = 'к';
				break;
			case 'l':
			case 'L':
				A[i] = 'ℓ';
				break;
			case 'm':
			case 'M':
				A[i] = 'м';
				break;
			case 'n':
			case 'N':
				A[i] = 'η';
				break;
			case 'o':
			case 'O':
				A[i] = 'σ';
				break;
			case 'p':
			case 'P':
				A[i] = 'ρ';
				break;
			case 'q':
			case 'Q':
				A[i] = 'q';
				break;
			case 'r':
			case 'R':
				A[i] = 'я';
				break;
			case 's':
			case 'S':
				A[i] = 'ѕ';
				break;
			case 't':
			case 'T':
				A[i] = 'т';
				break;
			case 'u':
			case 'U':
				A[i] = 'υ';
				break;
			case 'v':
			case 'V':
				A[i] = 'ν';
				break;
			case 'w':
			case 'W':
				A[i] = 'ω';
				break;
			case 'x':
			case 'X':
				A[i] = 'χ';
				break;
			case 'y':
			case 'Y':
				A[i] = 'у';
				break;
			case 'z':
			case 'Z':
				A[i] = 'z';
				break;
			}
			i++;
		}
		r = String.valueOf(A);
		return r;
	}

	public String style2(String t) {
		A = t.toCharArray();
		i = 0;
		len = t.length();
		while (i < len) {
			switch (A[i]) {
			case 'a':
			case 'A':
				A[i] = 'Á';
				break;
			case 'b':
			case 'B':
				A[i] = 'ß';
				break;
			case 'c':
			case 'C':
				A[i] = 'Č';
				break;
			case 'd':
			case 'D':
				A[i] = 'Ď';
				break;
			case 'e':
			case 'E':
				A[i] = 'Ĕ';
				break;
			case 'f':
			case 'F':
				A[i] = 'Ŧ';
				break;
			case 'g':
			case 'G':
				A[i] = 'Ğ';
				break;
			case 'h':
			case 'H':
				A[i] = 'Ĥ';
				break;
			case 'i':
			case 'I':
				A[i] = 'Ĩ';
				break;
			case 'j':
			case 'J':
				A[i] = 'Ĵ';
				break;
			case 'k':
			case 'K':
				A[i] = 'Ķ';
				break;
			case 'l':
			case 'L':
				A[i] = 'Ĺ';
				break;
			case 'm':
			case 'M':
				A[i] = 'M';
				break;
			case 'n':
			case 'N':
				A[i] = 'Ń';
				break;
			case 'o':
			case 'O':
				A[i] = 'Ő';
				break;
			case 'p':
			case 'P':
				A[i] = 'P';
				break;
			case 'q':
			case 'Q':
				A[i] = 'Q';
				break;
			case 'r':
			case 'R':
				A[i] = 'Ŕ';
				break;
			case 's':
			case 'S':
				A[i] = 'Ś';
				break;
			case 't':
			case 'T':
				A[i] = 'Ť';
				break;
			case 'u':
			case 'U':
				A[i] = 'Ú';
				break;
			case 'v':
			case 'V':
				A[i] = 'V';
				break;
			case 'w':
			case 'W':
				A[i] = 'Ŵ';
				break;
			case 'x':
			case 'X':
				A[i] = 'Ж';
				break;
			case 'y':
			case 'Y':
				A[i] = 'Ŷ';
				break;
			case 'z':
			case 'Z':
				A[i] = 'Ź';
				break;
			}
			i++;
		}
		r = String.valueOf(A);
		return r;
	}

	public String style3(String t) {
		A = t.toCharArray();
		i = 0;
		len = t.length();
		while (i < len) {
			switch (A[i]) {
			case 'a':
			case 'A':
				A[i] = 'ค';
				break;
			case 'b':
			case 'B':
				A[i] = '๒';
				break;
			case 'c':
			case 'C':
				A[i] = 'ς';
				break;
			case 'd':
			case 'D':
				A[i] = '๔';
				break;
			case 'e':
			case 'E':
				A[i] = 'є';
				break;
			case 'f':
			case 'F':
				A[i] = 'Ŧ';
				break;
			case 'g':
			case 'G':
				A[i] = 'ﻮ';
				break;
			case 'h':
			case 'H':
				A[i] = 'ђ';
				break;
			case 'i':
			case 'I':
				A[i] = 'เ';
				break;
			case 'j':
			case 'J':
				A[i] = 'ן';
				break;
			case 'k':
			case 'K':
				A[i] = 'к';
				break;
			case 'l':
			case 'L':
				A[i] = 'l';
				break;
			case 'm':
			case 'M':
				A[i] = '๓';
				break;
			case 'n':
			case 'N':
				A[i] = 'ภ';
				break;
			case 'o':
			case 'O':
				A[i] = '๏';
				break;
			case 'p':
			case 'P':
				A[i] = 'ק';
				break;
			case 'q':
			case 'Q':
				A[i] = 'ợ';
				break;
			case 'r':
			case 'R':
				A[i] = 'г';
				break;
			case 's':
			case 'S':
				A[i] = 'ร';
				break;
			case 't':
			case 'T':
				A[i] = 't';
				break;
			case 'u':
			case 'U':
				A[i] = 'ย';
				break;
			case 'v':
			case 'V':
				A[i] = 'ש';
				break;
			case 'w':
			case 'W':
				A[i] = 'ฬ';
				break;
			case 'x':
			case 'X':
				A[i] = 'א';
				break;
			case 'y':
			case 'Y':
				A[i] = 'ץ';
				break;
			case 'z':
			case 'Z':
				A[i] = 'z';
				break;
			}
			i++;
		}
		r = String.valueOf(A);
		return r;
	}

	public String numberstyle(String t) {
		A = t.toCharArray();
		i = 0;
		len = t.length();
		while (i < len) {
			switch (A[i]) {
			case 'a':
			case 'A':
				A[i] = '4';
				break;
			case 'e':
			case 'E':
				A[i] = '3';
				break;
			case 'i':
			case 'I':
				A[i] = '1';
				break;

			case 'o':
			case 'O':
				A[i] = '0';
				break;
			case 's':
			case 'S':
				A[i] = '5';
				break;
			case 't':
			case 'T':
				A[i] = '7';
				break;
			}
			i++;
		}
		r = String.valueOf(A);
		return r;
	}
}
