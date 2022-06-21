from django.http import HttpResponse
from django.template import Template, context
from django.template.loader import get_template
from django.shortcuts import render

def saludo(request):
    
    return render(request, "miplantilla.html")